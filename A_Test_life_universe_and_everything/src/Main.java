import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static  void main(String[] args){
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0;;i++){
            arrayList.add(random.nextInt(101));
            if(arrayList.get(i) == 42)break;
        }

        for(int e : arrayList){
            if(!(e == 42))
                System.out.println(e);
        }




    }
}
