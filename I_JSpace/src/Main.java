public class Main {
    public static void main(String[] args) {
        System.out.println(deleteSpaces("ka  rr         ol jajajaja      huj"));
    }

    static String deleteSpaces(String word){
        StringBuilder appWord = new StringBuilder(word);

        for(int i = 0; i < appWord.length(); i++){

            if(appWord.charAt(i) == ' '){
                appWord.replace(i, i+1, "");
                if(appWord.charAt(i) != ' '){
                char x = Character.toUpperCase(appWord.charAt(i));
                appWord.replace(i,i+1, String.valueOf(x));
                }else{
                    while (appWord.charAt(i) == ' '){
                        appWord.replace(i, i+1, "");
                        if(appWord.charAt(i) != ' '){
                            char x = Character.toUpperCase(appWord.charAt(i));
                            appWord.replace(i,i+1, String.valueOf(x));
                        }

                    }
                }
            }
        }

        String solution = String.valueOf(appWord);

        return solution;
    }
}
