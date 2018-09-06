
package userShip;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class KeyboardController implements KeyListener {

    private boolean[] statusOfKeys;

    public  KeyboardController(){
        statusOfKeys = new boolean[256];
    }

    public boolean getStatusOfKeys(int keyCode) {
        if(keyCode < 0 || keyCode > 255)
        {
            return false;
        }
        else
        {
            return statusOfKeys[keyCode];
        }
    }
    public void resetController(){
        statusOfKeys = new boolean[256];
    }
    @Override
    public void keyTyped(KeyEvent ke){

    }
    @Override
    public void keyPressed(KeyEvent ke){
        statusOfKeys[ke.getKeyCode()] = true;
    }
    @Override
    public void keyReleased(KeyEvent ke ){
        statusOfKeys[ke.getKeyCode()] = false;
    }
}
