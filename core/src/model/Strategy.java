package model;

public interface Strategy {
    void move(Game game, World world, Unit unit, Move move);
}
