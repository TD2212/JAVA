import java.util.Scanner;

class RandomNumber {
    private int num;

    public RandomNumber(int i) {
        this.num = i; // Initialize num with the provided value
    }

    public void checkNumber(int user) {
        if (user == num) {
            System.out.println("Number is correct: " + num);
        } else if (user < num) {
            System.out.println("Number is lower than: " + num);
        } else {
            System.out.println("Number is bigger than: " + num);
        }
    }
}

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int user = s.nextInt();
        
        RandomNumber r = new RandomNumber(50); // Create an instance with num = 50
        r.checkNumber(user); // Call the method to check the number
        
        s.close(); // Close the scanner
    }
}
