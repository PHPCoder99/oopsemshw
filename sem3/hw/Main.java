package ru.gb.learn.game;

import java.util.Scanner;

public class Main
{
    // todo: ввод пользователя
    // todo: логирование пользовательских попыток
    // todo: реализовать рестарт игры
    // todo: реализовать английскую версию
    public static void main (String[] args)
    {
        AbstractGame game = new NumberGame ();
        System.out.println (); // todo: comment Of The Year
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите длину слова:");
        int wordLength = scanner.nextInt ();
        System.out.println ("Введите количество попыток:");
        int tryCount = scanner.nextInt ();
        scanner.nextLine ();
        game.start (wordLength, tryCount);
        boolean isFinish = false;
        boolean isWin = false;
        while (!(isFinish || isWin))
        {
            Answer answer = game.inputValue (scanner.nextLine ());
            if (answer != null) System.out.println ("answer = " + answer);
            isFinish = game.getGameStatus () == GameStatus.FINISH;
            isWin = game.getGameStatus () == GameStatus.WIN;
        }
        if (isWin) System.out.println ("Вы победили!");
        else System.out.println ("Вы проиграли...");
    }
}
