public class ReverseClass {

    private int reverse = 0;
    private int solution;


    void reversing(int number){


        while(number!=0){
            int remainder = number%10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
    }
    void compare(int number){
        for(int i = number;;i++){
            reversing(i);

            if(i == reverse){
                solution = i;
                break;
            }else {
                reverse = 0;
            }
        }
    }

    public int getSolution(){
        return solution;
    }
}
