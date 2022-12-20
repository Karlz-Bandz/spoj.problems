import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ReverseClass revert = new ReverseClass();
        Scanner scanner = new Scanner(System.in);
        int x;
        ArrayList<Integer>arrayList = new ArrayList<>();

        System.out.println("How many cases?");
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++){
            x = scanner.nextInt();

            revert.compare(x);
            x = revert.getSolution();
            arrayList.add(x);
        }

        for (int c : arrayList){
            System.out.println(c);
        }





    }
}
