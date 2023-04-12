import java.util.Scanner;

public class Menu {
    private boolean authorisation;

    public void setAuthorisation(boolean authorisation) {
        this.authorisation = authorisation;
    }

    public void introductionText() {
        System.out.println("||============================================||");
        System.out.println("||           Welcome to CrateCount!           ||");
        System.out.println("|| Please select one of the following options ||");
        System.out.println("||      By entering either 1, 2, 3 or 4!      ||");
        System.out.println("||============================================||");
        System.out.println("||             1. Count the crates            ||");
        System.out.println("||          2. Add new crates (Manager)       ||");
        System.out.println("||          3. Remove crates (Manager)        ||");
        System.out.println("||         4. Edit information (Manager)      ||");
        System.out.println("||============================================||");
        choice();
    }

    public void choice() {
        Scanner scanner = new Scanner(System.in);
        Count count = new Count();
        Addition addition = new Addition();
        Removal remove = new Removal();
        Edit edit = new Edit();
        User user = new User();

        int choice = scanner.nextInt();
        while (true) {
            boolean breakloop = false;
            switch (choice) {
                case 1:
                    count.countItem();
                    breakloop = true;
                case 2:
                    if (authorisation) {
                        addition.addItem(scanner);
                        finalWords();
                        breakloop = true;
                        break;
                    }
                    else {
                        System.out.println("You are not authorised to use this feature!");
                        System.exit(0);
                    }
                case 3:
                    if (authorisation) {
                        remove.removeItem();
                        finalWords();
                        breakloop = true;
                    }
                    else {
                        System.out.println("You are not authorised to use this feature!");
                        System.exit(0);
                    }
                case 4:
                    if (authorisation) {
                        edit.editItem();
                        finalWords();
                        breakloop = true;
                    }
                    else {
                        System.out.println("You are not authorised to use this feature!");
                        System.exit(0);
                    }
                default:
                    System.out.println("Please enter a number between 1 and 4!");
            if (breakloop) {
                break;
            }
            }
        }
    }

    public void useOtherFunction() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Would you like to use another function? Y/N");
        String yesNo = scanner.nextLine();
        if (yesNo.toLowerCase().equals("y")) {
            introductionText();
        }
        else if (yesNo.toLowerCase().equals("n")) {
            finalWords();
        }
        else {
            System.out.println( "That is not a valid option!");
            finalWords();
        }
    }

    public void finalWords() {
        System.out.println( "\nThanks for using CrateCount!\n" +
                            "Your changes have been successful!");
        System.exit(0);
    }
}
