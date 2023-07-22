package sem7.hw;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String operation = "";
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> complexList1 = new ArrayList<>();
        ArrayList<Double> complexList2 = new ArrayList<>();
        ComplexCalculator complexCalculator = new ComplexCalculator();
        ListNumberAdapter listNumberAdapter = new ListNumberAdapter();
        Menu menu = new Menu();
        while (true){
            System.out.println("Введите +-*/ или q чтобы выйти: ");
            operation = scanner.nextLine();
            if (Objects.equals(operation, "q")){
                break;
            }
            System.out.println("Введите действительную часть первого числа: ");
            complexList1.add(menu.inputDouble());
            System.out.println("Введите коофицент i первого числа: ");
            complexList1.add(menu.inputDouble());
            System.out.println("Введите действительную часть второго числа: ");
            complexList2.add(menu.inputDouble());
            System.out.println("Введите коофицент i второго числа: ");
            complexList2.add(menu.inputDouble());
            switch (operation) {
                case "+" -> System.out.println(complexCalculator.sumc(listNumberAdapter.asComplexNumberDouble(complexList1), listNumberAdapter.asComplexNumberDouble(complexList2)));
                case "-" -> System.out.println(complexCalculator.subc(listNumberAdapter.asComplexNumberDouble(complexList1), listNumberAdapter.asComplexNumberDouble(complexList2)));
                case "*" -> System.out.println(complexCalculator.mulc(listNumberAdapter.asComplexNumberDouble(complexList1), listNumberAdapter.asComplexNumberDouble(complexList2)));
                case "/" -> System.out.println(complexCalculator.divc(listNumberAdapter.asComplexNumberDouble(complexList1), listNumberAdapter.asComplexNumberDouble(complexList2)));
            }
        }
    }
}
