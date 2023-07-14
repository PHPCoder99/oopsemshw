package sem4.hw;

public class Calculator {
    public static Integer sum(Integer a, Integer b){
        return a+b;
    }

    public static Integer sub(Integer a, Integer b){
        return a-b;
    }

    public static Integer mul(Integer a, Integer b){
        return a*b;
    }

    public static Integer div(Integer a, Integer b){
        if (b == 0){
            return 0;
        }
        return a/b;
    }

    public static Integer binary(Integer a){
        StringBuilder binary = new StringBuilder();
        while (a>0){
            binary.insert(0, String.valueOf(a % 2));
            a = a / 2;
        }
        return Integer.valueOf(binary.toString());
    }

    public static Integer binary(String a){
        try {
            Integer aint = Integer.parseInt(a);
            StringBuilder binary = new StringBuilder();
            while (aint > 0) {
                binary.insert(0, String.valueOf(aint % 2));
                aint = aint / 2;
            }
            return Integer.valueOf(binary.toString());
        } catch (NumberFormatException e){
            return -1;
        }
    }
}
