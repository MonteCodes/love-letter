import controller.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game g = new Game(in);
        g.setPlayers();
        g.start();
    }

}
