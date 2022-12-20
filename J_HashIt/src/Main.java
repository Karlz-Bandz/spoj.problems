public class Main {
    public static void main(String[] args) {

        Repo repo = new Repo();
        repo.createRepo();

        System.out.println(repo.getAll());

        System.out.println();

        System.out.println(repo.finalMethod(repo));

    }
}
