import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] PESEL = new int[11];

        String pesel = scanner.nextLine();

        if(pesel.length() < 11 || pesel.length() > 11){
            System.out.println("Error!");
            System.exit(0);
        }

        PESEL[0] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(0)));
        PESEL[1] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(1)));
        PESEL[2] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(2)));
        PESEL[3] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(3)));
        PESEL[4] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(4)));
        PESEL[5] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(5)));
        PESEL[6] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(6)));
        PESEL[7] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(7)));
        PESEL[8] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(8)));
        PESEL[9] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(9)));
        PESEL[10] = Integer.parseInt(String.valueOf(String.valueOf(pesel).charAt(10)));

        int check = PESEL[0] + PESEL[1]*3 + PESEL[2]*7 + PESEL[3]*9 + PESEL[4] + PESEL[5]*3 +
                    PESEL[6]*7 + PESEL[7]*9 + PESEL[8] + PESEL[9]*3 + PESEL[10];

        int check2 = check%10;

        if(check2 == 0){
            System.out.println("Poprawny pesel");

        }
        else {
            System.out.println("Nie ma takiego peselu!");
        }
    }
}
