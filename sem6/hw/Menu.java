package sem6.hw;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private static Boolean isIntConvertible(String potentialInt){
        try {
            Integer.parseInt(potentialInt);
            return true;
        } catch (NumberFormatException | NullPointerException e){
            return false;
        }
    }

    public static String inputOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию (+-*/) либо q чтобы выйти: ");
        String operation = scanner.nextLine();
        while (!Objects.equals(operation, "+") && !Objects.equals(operation, "-") && !Objects.equals(operation, "*") && !Objects.equals(operation, "/") && !Objects.equals(operation, "q")){
            System.out.println("Неверный ввод. Введите операцию (+-*/) либо q чтобы выйти: ");
            operation = scanner.nextLine();
        }
        return operation;
    }

    public static ComplexNumber inputComplexNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целочисленную действительную часть: ");
        String realPart = scanner.nextLine();
        while (!isIntConvertible(realPart)){
            System.out.println("Неверный ввод, попробуйте еще раз: ");
            realPart = scanner.nextLine();
        }
        System.out.println("Введите целочисленный коофецент мнимой единицы (0 если число действительное): ");
        String complexPart = scanner.nextLine();
        while (!isIntConvertible(complexPart)){
            System.out.println("Неверный ввод, попробуйте еще раз: ");
            complexPart = scanner.nextLine();
        }
        return new ComplexNumber(Integer.parseInt(realPart), Integer.parseInt(complexPart));
    }
}
