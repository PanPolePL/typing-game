package com.typinggame;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.typinggame.TypingGame;
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.useVsync(true);
		config.setWindowedMode(1280,720);
		config.setTitle("TypingGame");
		new Lwjgl3Application(new TypingGame(), config);
	}
}
