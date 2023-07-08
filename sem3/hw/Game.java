package sem3.hw;

public interface Game
{
    void start (int wordLength, int attempts);
    
    Answer inputValue (String input);
    
    GameStatus getGameStatus ();
}
