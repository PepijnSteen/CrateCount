import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public void introductionText() {
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

    public void switchStatement(int pick, ArrayList<BottleInfo> drink) {


    }
    public void optionsMenu() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Addition addition = new Addition();
        Count count = new Count();
        Removal remove = new Removal();
        Edit edit = new Edit();

        introductionText();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //count();
                    break;
                case 2:
                    Soda soda = new Soda();
                    AlcholicBeer beer = new AlcholicBeer();
                    NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

                    System.out.println("What new drink are you adding?");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.println("What's the price of the " + name + "?");
                    double price = scanner.nextDouble();

                    System.out.println("Is " + name + " a:\n" +
                            "1. Soda \n 2. Beer \n 3. Non-Alcoholic Beer \n Please enter either 1, 2 or 3");

                    int pick = scanner.nextInt();
                    switch (pick) {
                        case 1:
                            addition.addNewCrates(soda.getDrink(), scanner);
                        case 2:
                            addition.addNewCrates(beer.getDrink(), scanner);
                        case 3:
                            addition.addNewCrates(nonAlcoholicBeer.getDrink(), scanner);
                    }
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
