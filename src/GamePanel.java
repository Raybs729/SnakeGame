import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE; // this is each individual space for snake to move on game screen.
    static final int DELAY = 75; // the higher the number the slower the game is
    final int x[] = new int[GAME_UNITS]; //snake will not be bigger than total game units (game itself)
    final int y[] = new int[GAME_UNITS]; //this holds y coordinates while x holds x coordinates
    int bodyParts = 6;
    int applesEaten; //
    int appleX; //x coordinate where apple is located. will appear randomly
    int appleY; //y position of apple
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;
    public GamePanel(){

    }
    public void startGame(){

    }
    public void paintComponent(Graphics g){

    }
    public void draw (Graphics g){

    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
}
