import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Player implements Serializable {
    Sign sign;
    State state;

    String name;

    ImageIcon signMarked;
    boolean won;


    public Sign getSign() {
        return sign;
    }

    public ImageIcon getSignMarked() {
        return signMarked;
    }

    public boolean isWon() {
        return won;
    }

    public Player(String name, Sign sign){
        this.name = name;
        this.sign = sign;

        if (sign == Sign.CROSS){
            signMarked = refitIcon(createIcon("cross.jpg"),150,200);
        } else if (sign == Sign.CIRCLE) {
            signMarked = refitIcon(createIcon("circle.png"),150,200);
        }
        state = State.WAITING;
        won = false;


    }


    public ImageIcon createIcon(String path){
        ImageIcon imageIcon = null;
        BufferedImage image = null;


        try {
            image = ImageIO.read(new File("assets/" + path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        imageIcon = new ImageIcon(image);
        return imageIcon;
    }

    public ImageIcon refitIcon(ImageIcon icon, int width, int height ){
        Image image = null;
        image = icon.getImage();
        image.getScaledInstance(width,height,Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }


  @Override
  public String toString() {
    return "Player{" +
      "sign=" + sign +
      ", name='" + name + '\'' +
      ", signMarked=" + signMarked +
      ", won=" + won +
      '}';
  }
}
