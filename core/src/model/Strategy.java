package model;

/**
 * Created with IntelliJ IDEA.
 * User: glotovd
 * Date: 03.12.13
 * Time: 21:29
 * To change this template use File | Settings | File Templates.
 */
public interface Strategy {
    void move(Game game, World world, Unit unit, Move move);
}
