
import java.util.Scanner;


public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jar jar = new Jar(null, 0);
        Prompter prompter = new Prompter(jar);
        prompter.play();
    }
}



