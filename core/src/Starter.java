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
   // test github
        width = 55;
        height = 55;
        int spawnUnitCount = 110;
        int cellSize = 15;
        World world = new World(width, height, spawnUnitCount, cellSize);
        Game game = new Game(world);
        Player player1 = new Player();

        player1.setColor(Color.RED);
        player1.setClassStategy("QuickGuy1");

        Player player2 = new Player();

        player2.setColor(Color.BLUE);
        player2.setClassStategy("QuickGuy2");

        Player player3 = new Player();

        player3.setColor(Color.ORANGE);
        player3.setClassStategy("SmartGuyStrategy");


        Player player4 = new Player();
        player4.setColor(Color.green);
        player4.setClassStategy("QuickGuy3");

        Player player5 = new Player();

        player5.setColor(Color.cyan);
        player5.setClassStategy("QuickGuy4");

        Player player6 = new Player();

        player6.setColor(Color.magenta);
        player6.setClassStategy("QuickGuy5");

        Player player7 = new Player();

        player7.setColor(Color.PINK);
        player7.setClassStategy("QuickGuy6");

        Player player8 = new Player();

        player8.setColor(Color.YELLOW);
        player8.setClassStategy("QuickGuy7");


        world.addPlayer(player1, 2, 2);
        world.addPlayer(player2, width - 2, height - 2);
        world.addPlayer(player3, width - 2, 2);
        world.addPlayer(player4, 2, height - 2);
      /*
        world.addPlayer(player5, width / 2, 0);
        world.addPlayer(player6, width / 2, height);
        world.addPlayer(player7, 0, height / 2);
        world.addPlayer(player8, width, height / 2);  */
        System.out.println("Run game...");
        game.run();

    }
}
