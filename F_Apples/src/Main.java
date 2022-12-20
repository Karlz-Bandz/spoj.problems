import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double bothOwners, firstOwner, x, julia, claudia;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("How many apples has Julia and Claudia: ");
            bothOwners = scanner.nextDouble();
            System.out.println("How many more apples has Claudia: ");
            firstOwner = scanner.nextDouble();


            x = (bothOwners - firstOwner)/2;
            julia = x;
            claudia = x + firstOwner;

            System.out.printf("Julia has %.2f apples.\n", julia);
            System.out.printf("Claudia has %.2f apples.\n", claudia);



        }
    }
}
