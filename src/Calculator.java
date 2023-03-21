import java.util.Scanner;

public class Calculator {
    public static String calc() throws Exception {
        Scanner scn = new Scanner(System.in);

        String exp = scn.nextLine();

        String result;

        char action;

        String[] data;

        if (exp.contains(" + ")) {
            data = exp.split(" \\+ ");
            action = '+';
        } else if (exp.contains(" - ")) {
            data = exp.split(" - ");
            action = '-';
        } else if (exp.contains(" * ")) {
            data = exp.split(" \\* ");
            action = '*';
        } else if (exp.contains(" / ")) {
            data = exp.split(" / ");
            action = '/';
        } else {
            throw new Exception("Некорректный знак действия");
        }
        
        String[] modifiedData = new String[data.length];
        if (data[0].contains("\"")) {
            for (int i = 0; i < data.length; i++) {
                modifiedData[i] = data[i].replace("\"", "");
            }
        } else throw new Exception("Первый элемент должен быть строкой");

        result = switch (action) {
            case '+' -> Operations.plus(modifiedData);
            case '-' -> Operations.minus(modifiedData);
            case '*' -> Operations.multiplication(modifiedData);
            case '/' -> Operations.division(modifiedData);
            default -> throw new Exception("Некорректная операция");
        };
        return result;
    }
}


