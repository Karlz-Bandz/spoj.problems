import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        solution(a,b,c);



    }
    static void solution(double a, double b, double c){

         double x;

         a = round(a);
         b = round(b);
         c = round(c);

         if(a != 0) {
             x = (c-b)/a;
             x = round(x);



             System.out.println("X = "+x+" NWR");

         }else{
             System.out.println("BR");
         }








    }

    static double round(double a){
        return Math.round(a * 100.0)/100.0;
    }
}
