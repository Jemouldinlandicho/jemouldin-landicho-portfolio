import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        System.out.println("==============================");
        System.out.println("          MIND READER");
        System.out.println("==============================");
        System.out.println("I will guess your final number!");

        do {
            System.out.println("\nThink of any whole number.");
            System.out.println("Keep your number a secret!");

            System.out.print("Ready? Type YES: ");
            sc.next();

            System.out.println("\nFollow these steps carefully.");
            System.out.println("1. Multiply your number by 2.");
            System.out.println("2. Add 10 to the result.");
            System.out.println("3. Divide the result by 2.");
            System.out.println("4. Subtract your original number.");

            System.out.println("\nCalculating your thoughts...");
            delay();

            System.out.println("Analyzing brain waves...");
            delay();

            System.out.println("Reading your mind...");
            delay();

            System.out.println("\n******************************");
            System.out.println("YOUR FINAL NUMBER IS...");
            delay();

            System.out.println("             5");
            System.out.println("******************************");

            System.out.println("\nAm I a real mind reader?");
            System.out.println("1. Yes, that's amazing!");
            System.out.println("2. No, that's a trick!");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your mind is an open book to me!");
            } else if (choice == 2) {
                System.out.println("Correct! Mathematics is the secret!");
            } else {
                System.out.println("Interesting choice!");
            }

            System.out.print("\nPlay again? (yes/no): ");
            again = sc.next();

        } while (again.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing!");
        System.out.println("The mind reader is signing off...");

        sc.close();
    }

    public static void delay() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}