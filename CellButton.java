import javax.swing.*;

public class CellButton extends JButton {
    Cell cell;

    public CellButton(Cell cell){
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
