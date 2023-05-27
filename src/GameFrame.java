import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); //pack will take jframe and fit it around the components that we add to frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
