import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        PrimeNumber primeNumber = new PrimeNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cases from 1 to 10: ");
        int cases = scanner.nextInt();

        System.out.println();

        if(cases < 1 || cases > 10){
            System.out.println("Error!");
            System.exit(0);
        }

        for(int i = 0; i < cases; i++){
            System.out.print("Enter a numerical range: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if(y < x){
                System.out.println("Error!");
                System.exit(0);
            }
            for (int j = x; j <= y; j++){
                primeNumber.getPrime(j);
            }
        }


      arrayList = primeNumber.getPrimeArray();

        for(int e : arrayList){
            System.out.println(e);
        }




    }
}
