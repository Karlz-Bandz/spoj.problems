import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num1, num2, num3, num4, sum, sum2, solution;
        String stringNum1, stringNum2, stringNum3, stringNum4, stringSum, stringSum2;

        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();

        stringNum1 = Integer.toString(num1);
        stringNum2 = Integer.toString(num2);
        stringNum3 = Integer.toString(num3);
        stringNum4 = Integer.toString(num4);

        stringSum = stringNum1 + stringNum2;
        stringSum2 = stringNum3 + stringNum4;

        sum = Integer.parseInt(stringSum);
        sum2 = Integer.parseInt(stringSum2);

        solution = sum + sum2;

        System.out.println(solution);


    }
}
