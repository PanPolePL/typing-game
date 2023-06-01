package com.typinggame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class InputProc {
    public Character output(){
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            return 'a';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.B)){
            return 'b';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.C)){
            return 'c';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.D)){
            return 'd';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.E)){
            return 'e';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.F)){
            return 'f';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.G)){
            return 'g';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.H)){
            return 'h';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.I)){
            return 'i';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.J)){
            return 'j';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.K)){
            return 'k';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.L)){
            return 'l';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.M)){
            return 'm';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.N)){
            return 'n';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.O)){
            return 'o';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.P)){
            return 'p';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.Q)){
            return 'q';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.R)){
            return 'r';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.S)){
            return 's';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.T)){
            return 't';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.U)){
            return 'u';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.V)){
            return 'v';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.W)){
            return 'w';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.X)){
            return 'x';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.Y)){
            return 'y';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.Z)){
            return 'z';
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            return ' ';
        }
        return '-';
    }
}
