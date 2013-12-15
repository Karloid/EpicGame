import model.Game;
import model.Player;
import model.World;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: glotovd
 * Date: 03.12.13
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class Starter {

    private static int width;
    private static int height;

    public static void main(String[] args) {
        System.out.println("Starting...");

        width = 77;
        height = 55;
        int spawnUnitCount = 60;
        int cellSize = 15;
        World world = new World(width, height, spawnUnitCount, cellSize);
        Game game = new Game(world);
        Player player1 = new Player();

        player1.setColor(Color.RED);
        player1.setClassStategy("QuickGuyStrategy");

        Player player2 = new Player();

        player2.setColor(Color.BLUE);
        player2.setClassStategy("QuickGuyStrategy2");

        Player player3 = new Player();

        player3.setColor(Color.ORANGE);
        player3.setClassStategy("SmartGuyStrategy");


        Player player4 = new Player();

        player4.setColor(Color.green);
        player4.setClassStategy("QuickGuyStrategy3");


        world.addPlayer(player1, 2, 2);
        world.addPlayer(player2, width -2, height -2);
        world.addPlayer(player3, width -2, 2);
        world.addPlayer(player4, 2, height -2);
        System.out.println("Run game...");
        game.run();

    }
}
