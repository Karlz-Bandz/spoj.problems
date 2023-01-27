import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> directions = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> myArrayMap = new HashMap<>();

        int verticalInt = 0;
        int horizontalInt = 0;
        char direction;

        direction = scanner.next().toUpperCase().charAt(0);

        if(direction == 'P'){
            while(direction != 'K'){
                direction = scanner.next().toUpperCase().charAt(0);

                if(direction == 'N' || direction == 'S' || direction == 'W' || direction == 'E'){
                    directions.add(direction);
                }

            }
        }

        for(char x: directions){
            System.out.println(x);
        }

        for(int i = 0; i < directions.size(); i++){
            if(i == 0){
                ArrayList<Integer> coordinateList = new ArrayList<>();
                coordinateList.add(0);
                coordinateList.add(0);

                myArrayMap.put(i,  coordinateList);
            }else{
                if(directions.get(i) == 'N'){
                    ArrayList<Integer> coordinateList = new ArrayList<>();
                    coordinateList.add(++verticalInt);
                    coordinateList.add(horizontalInt);

                    myArrayMap.put(i,  coordinateList);
                }
//
                else if(directions.get(i) == 'S'){
                    ArrayList<Integer> coordinateList = new ArrayList<>();
                    coordinateList.add(--verticalInt);
                    coordinateList.add(horizontalInt);

                    myArrayMap.put(i,  coordinateList);
                }
//
                else if(directions.get(i) == 'W'){
                    ArrayList<Integer> coordinateList = new ArrayList<>();
                    coordinateList.add(verticalInt);
                    coordinateList.add(--horizontalInt);

                    myArrayMap.put(i,  coordinateList);
                }
//
                else if(directions.get(i) == 'E'){
                    ArrayList<Integer> coordinateList = new ArrayList<>();
                    coordinateList.add(verticalInt);
                    coordinateList.add(++horizontalInt);

                    myArrayMap.put(i,  coordinateList);

                }
//
            }
        }



        System.out.println(myArrayMap.size());

        for (int i = 0; i < myArrayMap.size(); i++){
            System.out.println(myArrayMap.get(i));
        }

        Collection<ArrayList<Integer>> values = myArrayMap.values();

        for(Iterator<ArrayList<Integer>> itr = values.iterator(); itr.hasNext();){
            if(Collections.frequency(values, itr.next())>1)
            {
                itr.remove();
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < myArrayMap.size(); i++){
            System.out.println(myArrayMap.get(i));
        }
        System.out.println(myArrayMap.size());


    }

}
