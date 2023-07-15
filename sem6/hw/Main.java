package sem6.hw;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Complex z1;
        Complex z2;
        boolean isRunning = true;
        String operation = "";
        ComplexCalculator complexCalculator = new ComplexCalculator();
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
                case "+" -> System.out.println("Результат: " + complexCalculator.sumc(z1, z2));
                case "-" -> System.out.println("Результат: " + complexCalculator.subc(z1, z2));
                case "*" -> System.out.println("Результат: " + complexCalculator.mulc(z1, z2));
                case "/" -> System.out.println("Результат: " + complexCalculator.divc(z1, z2));
            }
        }
    }
}
