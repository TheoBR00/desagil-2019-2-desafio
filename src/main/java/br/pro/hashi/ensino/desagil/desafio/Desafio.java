package br.pro.hashi.ensino.desagil.desafio;

public class Desafio {
    public static void main(String[] args) {
        Board board = new Board();

        Target target = new Target();
        target.row = 4;
        target.col = 14;

        HumanPlayer humanPlayer = new HumanPlayer(0, 0);
        humanPlayer.changeRowToTen();
        System.out.println(humanPlayer.getRow());
        humanPlayer.board = board;

        CpuPlayer cpuPlayer = new CpuPlayer();
        cpuPlayer.row = 8;
        cpuPlayer.col = 18;
        cpuPlayer.board = board;

        System.out.println("Theo");
    }
}
