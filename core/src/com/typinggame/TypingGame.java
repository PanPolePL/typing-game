package com.typinggame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.ScreenUtils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TypingGame extends ApplicationAdapter {
	SpriteBatch batch;
	FreeTypeFontGenerator generator;
	FreeTypeFontGenerator.FreeTypeFontParameter parameter;
	BitmapFont fontTitle, fontText;
	File text;
	Scanner scan;
	String x;
	int textX,textY;
	String character;
	int progress;
	InputProc keyb;
	float progressPercentage;
	DecimalFormat df;

	@Override
	public void create () {
		batch = new SpriteBatch();
		keyb=new InputProc();
		df = new DecimalFormat("###.#");

		//fonts
		generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.size = 48;
		parameter.borderWidth=3;
		parameter.borderColor = Color.LIME;
		fontTitle = generator.generateFont(parameter);

		parameter.size=24;
		parameter.borderWidth=0;
		fontText=generator.generateFont(parameter);

		//other variables
		x="";
		textX=40;
		textY=580;
		progress=0;

		//file
		text = new File("text.txt");
		try {
			scan = new Scanner(text);
		} catch (java.io.FileNotFoundException e) {
			System.out.println("File does not exist");
		}

		while(scan.hasNextLine()){
			x=x.concat(scan.nextLine());
		}
		System.out.println(x);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		fontTitle.draw(batch,"Typing Game", 40,680);
		textX=40;
		textY=580;
		fontText.setColor(Color.LIME);
		for(int i=0; i<x.length();i++){
			if(x.charAt(i)=='/'){
				textX=40;
				textY-=50;
			}
			else{
				if(progress>i){
					fontText.setColor(Color.GREEN);
				}
				else{
					fontText.setColor(Color.WHITE);
				}
				character=String.valueOf(x.charAt(i));
				fontText.draw(batch,character,textX,textY);
				textX+=15;
			}
		}
		progressPercentage=((float)progress/(float)x.length())*100;
		if(progress==x.length()){
			progressPercentage=100;
		}
		else if(keyb.output().equals(x.charAt(progress)) || x.charAt(progress)=='/'){
			progress++;
		}
		fontTitle.draw(batch,df.format(progressPercentage)+"%",600,55);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		generator.dispose();
		fontTitle.dispose();
		fontText.dispose();
	}
}
