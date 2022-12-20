import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println(countLetter("karkkkkkkoorsssttsskkk"));
    }

    static ArrayList<Letter> countLetter(String word){

        StringBuilder appWord = new StringBuilder(word);

        ArrayList<Letter> solutions = new ArrayList<>();
        for(int i = 0; i < appWord.length(); i++){
            int counter = 1;
            for(int j = i+1; j<appWord.length();j++){
                if(word.charAt(i) == word.charAt(j) && word.charAt(i) != ' '){
                    counter++;
                    appWord.setCharAt(j, '0');

                }

            }
            if(appWord.charAt(i) != '0')
            solutions.add(new Letter(counter, appWord.charAt(i)));

        }
        return solutions;
    }

}
