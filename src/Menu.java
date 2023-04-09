import java.util.Scanner;

public class Menu {
    public void IntroductionText() {
        System.out.println("||============================================||");
        System.out.println("||           Welcome to CrateCount!           ||");
        System.out.println("|| Please select one of the following options ||");
        System.out.println("||============================================||");
        System.out.println("||             1. Count the crates            ||");
        System.out.println("||          2. Add new crates (Manager)       ||");
        System.out.println("||          3. Remove crates (Manager)        ||");
        System.out.println("||        4. Change the amount of crates      ||");
        System.out.println("||============================================||");
    }

    public void OptionsMenu() {
        Scanner scanner = new Scanner(System.in);
        IntroductionText();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //Tellen functie
                    break;
                case 2:
                    // Add functie
                    break;
                case 3:
                    // Remove functie
                    break;
                case 4:
                    // Change functie
                    break;
                default:
                    System.out.println("Please input either: 1, 2, 3 or 4");
            }
        }
    }
}
