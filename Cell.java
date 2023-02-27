import javax.swing.*;
import java.io.Serializable;

public class Cell implements Serializable {

    static String imgPath;

    @Override
    public String toString() {
        return "Cell{" +
                "marked=" + marked +
                '}';
    }

    Sign marked;
    static ImageIcon img;


    public Sign isMarked() {
        return marked;
    }

    public void setMarked(Sign marked) {
        this.marked = marked;
    }

    public Cell(){
        marked = null;
    }






}
