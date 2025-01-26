package DZ031;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isEmp = str ->{
            if(str.isEmpty()) {
                return true;
            }
            return false;
        };

        String str1 = "hfp";
        boolean res = isEmp.test(str1);
        System.out.println("Строка 1: " + str1);
        System.out.println("Строка 1 пустая: " + res);

        String str2 = "";
        boolean res2 = isEmp.test(str2);
        System.out.println("Строка 1: " + str2);
        System.out.println("Строка 1 пустая: " + res);

        }
    }









