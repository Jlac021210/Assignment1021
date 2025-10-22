import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name, bro? ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is " + name+" my name is fred");
        System.out.println("This is a change");
        scanner.close();
    }
}
