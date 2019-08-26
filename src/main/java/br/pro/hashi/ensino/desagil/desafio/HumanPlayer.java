package br.pro.hashi.ensino.desagil.desafio;

public class HumanPlayer {
    private int row;
    private int col;
    Board board;

    HumanPlayer(int initialRow, int initialCol){
        row = initialRow;
        col = initialCol;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public void changeRowToTen(){
        int row;
        row = 10;
    }


    void moveUp() {
        System.out.println("up");
    }

    void moveRight() {
        System.out.println("right");
    }

    void moveDown() {
        System.out.println("down");
    }

    void moveLeft() {
        System.out.println("left");
    }
}
