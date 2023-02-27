import java.io.Serializable;
import java.util.ArrayList;

public class Grid implements Serializable {
    ArrayList<Cell> cells;
    ArrayList<Player> players;
    int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

  @Override
  public String toString() {
    return "Grid{" +
      "cells=" + cells +
      ", players=" + players +
      ", size=" + size +
      '}';
  }

  public Grid(int size){
        this.size = size;
        cells = new ArrayList<>();
        players = new ArrayList<>();


        players.add(new Player("Jacques",Sign.CROSS));
        players.add(new Player("Pierre",Sign.CIRCLE));
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                cells.add(new Cell());
            }
        }
    }


    public ArrayList<Cell> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Cell> cells) {
        this.cells = cells;
    }

  public ArrayList<Cell> getColumn(int nb){
    ArrayList<Cell> column = new ArrayList<>();
    int whichColumn = nb%size;
    int stopCondition = size*size;
    for (int i = whichColumn; i < stopCondition ; i+=size) {
      column.add(this.getCells().get(i));
    }
    return column;
  }


  public ArrayList<Cell> getLine(int nb){
    ArrayList<Cell> line = new ArrayList<>();
    int whichLine = (int)Math.floor(nb/size);
    int stopCondition = whichLine*size+size;
    for (int i = whichLine*size; i < stopCondition; i++) {
      line.add(this.getCells().get(i));
    }
    return line;
  }

  public ArrayList<Cell> getDiagonals(int nb){
    ArrayList<Cell> diagonals = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      diagonals.add(this.getCells().get(i));
    }
    return diagonals;
  }

  public boolean arrayEqualLine(int nb)
  {

    for(int i=0;i<size;i++){
      if(this.getLine(nb).get(0)!=this.getLine(nb).get(i)){
        return false;
      }
    }
    return true;
  }

  public boolean arrayEqualColumn(int nb)
  {
    for(int i=0;i<size;i++){
      if(this.getColumn(nb).get(0)!=this.getColumn(nb).get(i)){

        return false;
      }
    }
    return true;
  }

  public boolean validGrid(int nb){

    if (this.arrayEqualLine(nb) || this.arrayEqualColumn(nb))
      return true;

    else
      return false;

  }


    public void addPlayers(Player player){
      players.add(player);
    }





}
