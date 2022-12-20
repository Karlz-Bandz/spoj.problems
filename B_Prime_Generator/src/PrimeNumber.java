import java.util.ArrayList;

public class PrimeNumber {
    private ArrayList<Integer> primeArray = new ArrayList<>();

    private boolean flag = true;

    void getPrime(int number) {

      for(int j = 1;j < number; j++) {

          flag = true;
          for (int i = 2; i < number; i++) {
              if ((number % i == 0)) {
                  flag = false;
                  break;
              }
          }
          if(flag == true){
              primeArray.add(number);
              break;
          }
      }
    }
    public ArrayList<Integer> getPrimeArray() {
        return primeArray;
    }
}
