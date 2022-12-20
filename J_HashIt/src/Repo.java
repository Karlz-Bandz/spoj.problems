import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repo {
    private LinkedList<MyData> dataRepo = new LinkedList<>();

   public void addElement(int key, MyData data){
       dataRepo.add(key, data);
   }




    public void updateRepoValue(int key, String value){
       dataRepo.get(key).setValue(value);
    }

    public void deleteObject(int key){
        dataRepo.remove(key);
    }

    public void createRepo(){
        dataRepo.push(new MyData("DEL", "wloskiej"));
        dataRepo.push(new MyData("DEL", "do"));
        dataRepo.push(new MyData("DEL", "od"));
        dataRepo.push(new MyData("ADD", "Polski"));
        dataRepo.push(new MyData("ADD", "do"));
        dataRepo.push(new MyData("ADD", "wloskiej"));
        dataRepo.push(new MyData("ADD", "ziemii"));
        dataRepo.push(new MyData("ADD", "z"));
        dataRepo.push(new MyData("ADD", "Dabrowski"));
        dataRepo.push(new MyData("ADD", "marsz"));
        dataRepo.push(new MyData("ADD", "marsz"));
    }

    public LinkedList<MyData> getAll(){
        return this.dataRepo;
    }

    public String getKeyService(int index){
        return this.dataRepo.get(index).getKey();
    }
    public String getValueService(int index){
        return this.dataRepo.get(index).getValue();
    }

    public Repo deleteDelObjects(Repo repo) {

        Repo methodRepo = repo;


        for (int i = 0; i < methodRepo.getAll().size(); i++) {

            if (methodRepo.getKeyService(i).equals("DEL")) {
                String flag = methodRepo.getValueService(i);
                methodRepo.deleteObject(i);
                methodRepo.addElement(i, new MyData("DEL", "DEL"));
                for (int j = 0; j < methodRepo.getAll().size(); j++) {
                    if (methodRepo.getValueService(j).equals(flag)) {
                        methodRepo.deleteObject(j);
                        methodRepo.addElement(j, new MyData("DEL", "DEL"));
                    }
                }
            }
        }
        return methodRepo;
    }

    public Repo lastValidation(Repo repo){
       Repo methodRepo = deleteDelObjects(repo);

       for(int i = 0; i < methodRepo.getAll().size(); i++){
           int j = i+1;
           String flag = methodRepo.getValueService(i);
           while(j < methodRepo.getAll().size()){
               if(methodRepo.getValueService(j).equals(flag) && !methodRepo.getValueService(j).equals("DEL")){
                   methodRepo.deleteObject(j);
                   methodRepo.addElement(j, new MyData("DEL", "DEL"));
               }
               j++;
           }
       }
       return methodRepo;
    }

    public LinkedList<MyData> deleteAllDuplicates(Repo repo){
       LinkedList<MyData> repository = lastValidation(repo).getAll();

       LinkedList<MyData> filterRepo = (LinkedList<MyData>) repository.stream()
               .filter(checkElements)
               .map(changeKeys)
               .collect(Collectors.toCollection(LinkedList::new));

       return filterRepo;
    }

    public LinkedList<MyData> finalMethod(Repo repo){
       LinkedList<MyData> finalRepo = deleteAllDuplicates(repo);
        Collections.sort(finalRepo);
        return finalRepo;
    }


    public Predicate<MyData> checkElements = x -> {
       return (!x.getValue().equals("DEL"));
    };

   public Function<MyData, MyData> changeKeys = x -> {
       Random random = new Random();

       x.setKey(Integer.toString(random.nextInt(1001)));
       return x;
   };








}
