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
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }
    public void startGame(){
        newApple(); //creates new apple on screen
        running = true; // its originally false meaning game is off
        timer = new Timer(DELAY, this); //this because we are using the action listener interface
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g); //this draws the grid lines. gridlines wouldn't appear without this line

    }
    public void draw (Graphics g) {
        for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) { //this will make the grid
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i * UNIT_SIZE, i * SCREEN_WIDTH, i * UNIT_SIZE);
        }
    }
    public void newApple(){

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
