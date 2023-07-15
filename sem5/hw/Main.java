package sem5.hw;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ComplexNumber z1;
        ComplexNumber z2;
        boolean isRunning = true;
        String operation = "";

        while (isRunning){
            operation = Menu.inputOperation();
            if (Objects.equals(operation, "q")){
                isRunning = false;
                break;
            }
            System.out.println("Введите первое число: ");
            z1 = Menu.inputComplexNumber();
            System.out.println("Введите второе число: ");
            z2 = Menu.inputComplexNumber();
            switch (operation) {
                case "+" -> System.out.println("Результат: " + ComplexCalculator.sum(z1, z2));
                case "-" -> System.out.println("Результат: " + ComplexCalculator.sub(z1, z2));
                case "*" -> System.out.println("Результат: " + ComplexCalculator.mul(z1, z2));
                case "/" -> System.out.println("Результат: " + ComplexCalculator.div(z1, z2));
            }
        }
    }
}
