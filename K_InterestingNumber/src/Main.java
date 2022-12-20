public class Main {

    public static void main(String[] args) {

        System.out.println(getSoolution(25));






    }

    public static int getSoolution(int number){

        int solution;

        for(int i = 10;;i++){


            int methodNumber = number;
            double x = i%methodNumber;
            int sum = 0;
            solution = i;
            int methodValue = i;

            if(x == 0){
                while (methodValue != 0) {
                    sum = sum + methodValue % 10;
                    methodValue = methodValue / 10;
                }
            }



            //System.out.println(solution);

            if(x == 0 && sum == methodNumber)
                break;


        }

        return solution;
    }




}
