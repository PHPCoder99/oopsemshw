package sem7.hw;

import sem6.hw.ComplexNumber;

import java.util.Scanner;

public class Menu implements IMenu{

    @Override
    public Boolean isDoubleConvertible(String i) {
        try {
            Integer.parseInt(i);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public Double inputDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десятичное число с точкой (.): ");
        String inDouble = scanner.nextLine();
        while (!isDoubleConvertible(inDouble)){
            System.out.println("Неверный ввод, попробуйте еще раз: ");
            inDouble = scanner.nextLine();
        }
        return Double.parseDouble(inDouble);
    }
}
