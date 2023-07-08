package ru.gb.learn.game;

public class Answer
{
    private int bulls;
    private int cows;
    
    public Answer ()
    {
    }
    
    public Answer (int bulls, int cows)
    {
        this.bulls = bulls;
        this.cows = cows;
    }
    
    @Override
    public String toString ()
    {
        return "быки = " + bulls + ", коровы = " + cows;
    }
    
    public int getBulls ()
    {
        return bulls;
    }
    
    public int getCows ()
    {
        return cows;
    }
}
