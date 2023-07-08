package sem3.hw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) throws IOException {
        boolean restarting = true; // the all knowing overlord, `boolean restarting`.
        FileWriter myWriter = new FileWriter("gamelogs.txt");
        File gameFile = new File("gamelogs.txt");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите имя пользователя: ");
        String user = scanner.nextLine();
        Scanner fileScanner = new Scanner(gameFile);
        while (restarting) {
            // magic code i do not understand bc i didnt watch the seminar starts here
            myWriter.write("---Начался новый раунд.---\n");
            AbstractGame game = new NumberGame ();
            String userGuess;
            System.out.println ();
            System.out.println ("Введите длину слова:");
            int wordLength = scanner.nextInt ();
            System.out.println ("Введите количество попыток:");
            int tryCount = scanner.nextInt ();
            scanner.nextLine ();
            game.start (wordLength, tryCount);
            boolean isFinish = false;
            boolean isWin = false;
            while (!(isFinish || isWin)) {
                userGuess = scanner.nextLine();
                Answer answer = game.inputValue(userGuess);
                if (answer != null) {
                    System.out.println("answer = " + answer);
                    myWriter.write("Пользователь " + user + " ввел " + userGuess + ", в этом слове есть " + answer + "\n");
                } else {
                    myWriter.write("Пользователь " + user + " ввел " + userGuess + "\n");
                }
                isFinish = game.getGameStatus() == GameStatus.FINISH;
                isWin = game.getGameStatus() == GameStatus.WIN;
            }
            if (isWin) {
                System.out.println ("Вы победили!");
                myWriter.write("Пользователь " + user + " победил.");
            } else {
                System.out.println ("Вы проиграли...");
                myWriter.write("Пользователь " + user + " проиграл.");

            }
            myWriter.write(" Было загаданно слово " + game.getWord() + ".\n");
            // magic code i do not understand bc i didnt watch the seminar ends here
            System.out.println("Введите операцию:");
            System.out.println("1 - начать заново");
            System.out.println("2 - закончить игру");
            System.out.println("3 - посмотреть ответ к предыдущему раунду и перезапустить игру");
            System.out.println("4 - показать всю историю игры и перезапустить игру");
            System.out.println("5 - посмотреть ответ к предыдущему раунду и закончить");
            System.out.println("6 - показать всю историю игры и закончить");
            switch (scanner.nextLine()) {
                case "1":
                    myWriter.write("Пользователь " + user + " начал игру заново.\n");
                case "2":
                    restarting = false;
                    myWriter.write("Пользователь " + user + " закончил игру.\n");
                    break;
                case "3":
                    myWriter.write("Пользователь " + user + " просмотрел ответ и начал игру заново.\n");
                    System.out.println(game.getWord());
                    break;
                case "4":
                    myWriter.write("Пользователь " + user + " просмотрел историю игры и начал игру заново.\n");
                    // magic code i copied from stack overflow starts here
                    myWriter.close();
                    while (fileScanner.hasNextLine()){
                        System.out.println(fileScanner.nextLine());
                    }
                    myWriter = new FileWriter("gamelogs.txt", true);
                    fileScanner = new Scanner(gameFile);
                    // magic code i copied from stack overflow ends here
                    break;
                case "5":
                    myWriter.write("Пользователь " + user + " просмотрел ответ и закончил игру.\n");
                    System.out.println(game.getWord());
                    restarting = false;
                    break;
                case "6":
                    myWriter.write("Пользователь " + user + " просмотрел историю игры и закончил игру.\n");
                    // magic code i copied from stack overflow starts here
                    myWriter.close();
                    while (fileScanner.hasNextLine()){
                        System.out.println(fileScanner.nextLine());
                    }
                    // magic code i copied from stack overflow ends here
                    restarting = false;
                    break;
                default:
                    System.out.println("Неверный ввод. Начинаем игру заново...");
            }
        }
        myWriter.close();
    }
}
