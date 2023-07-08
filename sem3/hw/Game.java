package ru.gb.learn.game;

public interface Game
{
    void start (int wordLength, int attempts);
    
    Answer inputValue (String input);
    
    GameStatus getGameStatus ();
}
