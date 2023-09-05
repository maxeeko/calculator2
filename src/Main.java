public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(calc("1 + 5"));
    }

    public static String calc(String input) throws Exception {
        String messageError = "Введите два целых числа от 1 до 10 включительно и оператор (+, -, /, *)";
        String[] operands = input.split("[+-\\/*]");
        if (operands.length != 2) {
            throw new Exception(messageError);
        }
        for (int i = 0; i < operands.length; i++) {
            if (operands[i].length() > 2) {
                throw new Exception(messageError);
            }
        }
        int num1 = Integer.parseInt(operands[0].trim());
        int num2 = Integer.parseInt(operands[1].trim());

        if (num1 > 10 || num2 > 10) {
            throw new Exception("Числа не должны превышать 10");
        }

        int result = 0;

        if (input.contains("+")) {
            result = num1 + num2;
        } else if (input.contains("-")) {
            result = num1 - num2;
        } else if (input.contains("/")) {
            result = num1 / num2;
        } else result = num1 * num2;

        return String.valueOf(result);
    }
}
