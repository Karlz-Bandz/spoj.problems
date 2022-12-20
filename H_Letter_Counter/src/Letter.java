public class Letter {

    private int number;
    private char letter;

    public Letter(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;
    }

    @Override
    public String toString() {
        return
                 number + " " + letter + "\n";

    }
}
