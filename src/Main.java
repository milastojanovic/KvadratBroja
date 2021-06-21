import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();

        String resultString = "";
        int result = 0;

        try {
            result = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            e.getMessage();
        }

        for (int i = 0; i < input.length(); i++) {
            String ch = Character.toString(input.charAt(i));
            if ((i == 0) && ch.equals("-")) {
                resultString += "-";
            } else {
                if (ch.equals("0")) {
                    resultString += "9";
                } else {
                    int num = Integer.valueOf(ch);
                    resultString = resultString + (num * num);
                }
            }
        }

        result = Integer.valueOf(resultString);
        System.out.println(result);
    }
}
