public class Operations {
    public static String plus(String[] data) {

        return data[0] + data[1];
    }

    public static String minus(String[] data) {
        String result;
        if (data[0].contains(data[1])) {
            int r = data[0].length() - data[1].length();
            result = data[0].substring(0, r);
        } else {
            return data[0];
        }
        return result;
    }

    public static String multiplication(String[] data) throws Exception {
        String result = data[0].repeat(Integer.parseInt(data[1]));
        if (Integer.parseInt(data[1]) > 10) {
            throw new Exception("Множитель не может быть больше 10");
        }
        if (result.length() > 40) {
            String plus = result.substring(0, 40);
            return (plus + "...");
        } else {
            return (result);
        }
    }

    public static String division(String[] data) throws Exception {
        int result, num1, num2;
        String solution;
        num1 = data[0].length();
        num2 = Integer.parseInt(data[1]);
        if (Integer.parseInt(data[1]) > 10) {
            throw new Exception("Делитель не может быть больше 10");
        }
        result = num1 / num2;
        solution = data[0].substring(0, result);
        return solution;
    }
}
