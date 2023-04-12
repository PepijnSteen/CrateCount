import java.util.Scanner;

interface Role {
    void checkRole();
}

class Addition implements Role {
    public void checkRole() {
        //
    }

    User user = new User();
    Soda soda = new Soda();
    AlcholicBeer beer = new AlcholicBeer();
    NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

    public void addItem(Scanner scanner) {
        System.out.println("What new drink are you adding?");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("What's the price of the " + name + "?");
        double price = scanner.nextDouble();

        System.out.println("How many crates would you ideally like to have of " + name + ".");
        int amount = scanner.nextInt();

        System.out.println("Is " + name + " a:\n" +
                "1. Soda \n 2. Beer \n 3. Non-Alcoholic Beer \n Please enter either 1, 2 or 3");
        int pick = scanner.nextInt();
        switch (pick) {
            case 1:
                addSoda(name, price, amount);
                break;
            case 2:
                addBeer(name, price, amount);
                break;
            case 3:
                addNonAlcoholicBeer(name, price, amount);
                break;

        }
    }

    public void addSoda(String name, double price, int amount)  {
        soda.addItem(name, price, amount);
        System.out.print("Your current soda's are: \n");
        soda.printArray();
    }

    public void addBeer(String name, double price, int amount) {
        beer.addItem(name, price, amount);
        System.out.print("Your current beers are: ");
        beer.printArray();
    }

    public void addNonAlcoholicBeer(String name, double price, int amount) {
        nonAlcoholicBeer.addItem(name, price, amount);
        System.out.print("Your current beers are: ");
        nonAlcoholicBeer.printArray();
    }
}

class Removal  implements Role{
    private int choice;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    boolean manager = false;


    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);
    Soda soda = new Soda();
    AlcholicBeer beer = new AlcholicBeer();
    NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }
    public void removeItem() {
        System.out.println("Is the drink you want to remove a:" +
                "1. Soda \n 2. Beer \n 3. Non-Alcoholic Beer \n Please enter either 1, 2 or 3");
        setChoice(scanner.nextInt());

        switch (choice) {
            case 1:
                soda.printArray();
                removeSoda();
                menu.useOtherFunction();
            case 2:
                beer.printArray();
                removeBeer();
                menu.useOtherFunction();
            case 3:
                nonAlcoholicBeer.printArray();
                removeNonAlcoholicBeer();
                menu.useOtherFunction();
        }
    }

    public void removeSoda() {
        System.out.println("What drink would you like to remove out of the database?");
        scanner.nextLine();
        String enteredName = scanner.nextLine();
        String removedName = enteredName.toLowerCase();

        for (int i = 0; i < soda.drink.size(); i++) {
            BottleInfo bottle = soda.drink.get(i);
            if (bottle.getName().toLowerCase().equals(removedName)) {
                soda.drink.remove(i);
                break;
            }
        }
        System.out.println("This is your current database");
        soda.printArray();
    }

    public void removeBeer() {
        System.out.println("What drink would you like to remove out of the database?");
        scanner.nextLine();
        String enteredName = scanner.nextLine();
        String removedName = enteredName.toLowerCase();

        for (int i = 0; i < beer.drink.size(); i++) {
            BottleInfo bottle = beer.drink.get(i);
            if (bottle.getName().toLowerCase().equals(removedName)) {
                beer.drink.remove(i);
                break;
            }
        }

        System.out.println("This is your current database");
        beer.printArray();
    }

    public void removeNonAlcoholicBeer() {
        System.out.println("What drink would you like to remove out of the database?");
        scanner.nextLine();
        String enteredName = scanner.nextLine();
        String removedName = enteredName.toLowerCase();

        for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
            BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
            if (bottle.getName().toLowerCase().equals(removedName)) {
                nonAlcoholicBeer.drink.remove(i);
                break;
            }
        }

        System.out.println("This is your current database");
        nonAlcoholicBeer.printArray();

    }
}

class Edit  implements Role{
    boolean manager = false;


    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);
    Soda soda = new Soda();
    AlcholicBeer beer = new AlcholicBeer();
    NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }

    public void editItem() {
        System.out.println("Is the drink you want to edit a:\n" +
                "1. Soda \n2. Beer \n3. Non-Alcoholic Beer \nPlease enter either 1, 2 or 3");
        switch (scanner.nextInt()) {
            case 1:
                editSoda();
                menu.useOtherFunction();
            case 2:
                editBeer();
                menu.useOtherFunction();
            case 3:
                editNonAlcoholicBeer();
                menu.useOtherFunction();
        }
    }

    public void editSoda() {
        Menu menu = new Menu();

        System.out.println( "These are the sodas currently in your database\n" +
                "Which soda would you like to edit?");
        soda.printArray();
        scanner.nextLine();
        String editItem = scanner.nextLine();
        System.out.println( "\nWould you like to edit the name, price, amount or all of the above? \n" +
                "Please enter 1 for a new name, \n" +
                "2 for a new price, \n" +
                "3 for a new maximum amount or \n" +
                "4 for all of the above (if you wish to change 2, please select 4 as well and enter the same value for what you want to keep.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < soda.drink.size(); i++) {
                    BottleInfo bottle = soda.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        bottle.setName(newName);
                    }
                }
                soda.printArray();
                menu.useOtherFunction();
            case 2:
                for (int i = 0; i < soda.drink.size(); i++) {
                    BottleInfo bottle = soda.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new price:");
                        double newPrice = scanner.nextDouble();
                        bottle.setPrice(newPrice);
                    }
                }
                soda.printArray();
                menu.useOtherFunction();
            case 3:
                for (int i = 0; i < soda.drink.size(); i++) {
                    BottleInfo bottle = soda.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new maximum amount:");
                        int newAmount = scanner.nextInt();
                        bottle.setAmount(newAmount);
                    }
                }
                soda.printArray();
                menu.useOtherFunction();
            case 4:
                for (int i = 0; i < soda.drink.size(); i++) {
                    BottleInfo bottle = soda.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the (new) name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        bottle.setName(newName);
                        System.out.print("Please enter the new price:");
                        double newPrice = scanner.nextDouble();
                        bottle.setPrice(newPrice);
                        System.out.print("Please enter the new maximum amount:");
                        int newAmount = scanner.nextInt();
                        bottle.setAmount(newAmount);
                    }
                }
                soda.printArray();
                menu.useOtherFunction();
            default:
                System.out.println("Only values between 1 and 4 are allowed");
                menu.introductionText();
        }
    }

    public void editBeer() {
        Menu menu = new Menu();

        System.out.println( "These are the beers currently in your database\n" +
                "Which beer would you like to edit?");
        beer.printArray();
        scanner.nextLine();
        String editItem = scanner.nextLine();
        System.out.println( "\nWould you like to edit the name, price, amount or all of the above? \n" +
                "Please enter 1 for a new name, \n" +
                "2 for a new price, \n" +
                "3 for a new maximum amount or \n" +
                "4 for all of the above (if you wish to change 2, please select 4 as well and enter the same value for what you want to keep.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < beer.drink.size(); i++) {
                    BottleInfo bottle = beer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        bottle.setName(newName);
                    }
                }
                beer.printArray();
                menu.useOtherFunction();
            case 2:
                for (int i = 0; i < beer.drink.size(); i++) {
                    BottleInfo bottle = beer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new price:");
                        double newPrice = scanner.nextDouble();
                        bottle.setPrice(newPrice);
                    }
                }
                beer.printArray();
                menu.useOtherFunction();
            case 3:
                for (int i = 0; i < beer.drink.size(); i++) {
                    BottleInfo bottle = beer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new maximum amount:");
                        int newAmount = scanner.nextInt();
                        bottle.setAmount(newAmount);
                    }
                }
                beer.printArray();
                menu.useOtherFunction();
            case 4:
                for (int i = 0; i < beer.drink.size(); i++) {
                    BottleInfo bottle = beer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the (new) name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        bottle.setName(newName);
                        System.out.print("Please enter the new price:");
                        double newPrice = scanner.nextDouble();
                        bottle.setPrice(newPrice);
                        System.out.print("Please enter the new maximum amount:");
                        int newAmount = scanner.nextInt();
                        bottle.setAmount(newAmount);
                    }
                }
                beer.printArray();
                menu.useOtherFunction();
            default:
                System.out.println("Only values between 1 and 4 are allowed");
                menu.introductionText();
        }
    }

    public void editNonAlcoholicBeer() {
        Menu menu = new Menu();

        System.out.println( "These are the non-alcoholic beers currently in your database\n" +
                "Which non-alcoholic beers would you like to edit?");
        nonAlcoholicBeer.printArray();
        scanner.nextLine();
        String editItem = scanner.nextLine();
        System.out.println( "Would you like to edit the name, price, amount or all of the above? \n" +
                "Please enter 1 for a new name, \n" +
                "2 for a new price, \n" +
                "3 for a new maximum amount or \n" +
                "4 for all of the above (if you wish to change 2, please select 4 as well and enter the same value for what you want to keep.");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
                    BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        bottle.setName(newName);
                    }
                }
                menu.useOtherFunction();
            case 2:
                for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
                    BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new price:");
                        double newPrice = scanner.nextDouble();
                        bottle.setPrice(newPrice);
                    }
                }
                menu.useOtherFunction();
            case 3:
                for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
                    BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new maximum amount:");
                        int newAmount = scanner.nextInt();
                        bottle.setAmount(newAmount);
                    }
                }
                menu.useOtherFunction();
            case 4:
                for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
                    BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
                    if (bottle.getName().toLowerCase().equals(editItem.toLowerCase())) {
                        System.out.print("Please enter the new name:");
                        scanner.nextLine();
                        String newName = scanner.nextLine();
                        bottle.setName(newName);
                        System.out.print("Please enter the new price:");
                        double newPrice = scanner.nextDouble();
                        bottle.setPrice(newPrice);
                        System.out.print("Please enter the new maximum amount:");
                        int newAmount = scanner.nextInt();
                        bottle.setAmount(newAmount);
                    }
                }
                menu.useOtherFunction();
            default:
                System.out.println("Only values between 1 and 4 are allowed");
                menu.introductionText();
        }
    }
}

class Count  implements Role{
    boolean manager = false;

    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);
    Soda soda = new Soda();
    AlcholicBeer beer = new AlcholicBeer();
    NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }

    public void countItem() {
        System.out.println("Is the crate you want to count a:\n" +
                "1. Soda \n2. Beer \n3. Non-Alcoholic Beer \nPlease enter either 1, 2 or 3");
        switch (scanner.nextInt()) {
            case 1:
                countSoda();
                menu.useOtherFunction();
            case 2:
                countBeer();
                menu.useOtherFunction();
            case 3:
                countNonAlcoholicBeer();
                menu.useOtherFunction();
        }
    }

    public void countSoda() {

        int amount;
        System.out.println("These are the sodas you can count");
        soda.printArray();

        System.out.println("What soda would you like to count?");
        scanner.nextLine();
        String countItem = scanner.nextLine();

        for (int i = 0; i < soda.drink.size(); i++) {
            BottleInfo bottle = soda.drink.get(i);
            if (bottle.getName().toLowerCase().equals(countItem.toLowerCase())) {
                System.out.println("How many crates do you have?");
                amount = scanner.nextInt();
                if (amount > bottle.getAmount()) {
                    System.out.println("You already have more crates than your maximum!");
                }
                else if (amount == bottle.getAmount()) {
                System.out.println("You already have your maximum amount of crates!");
                }
                else if (amount < bottle.getAmount()){
                System.out.println("You need to order " + (bottle.getAmount() - amount) + " crates!");
                }
            }
        }
    }

    public void countBeer() {

        int amount;
        System.out.println("These are the beers you can count");
        beer.printArray();

        System.out.println("What beer would you like to count?");
        scanner.nextLine();
        String countItem = scanner.nextLine();

        for (int i = 0; i < beer.drink.size(); i++) {
            BottleInfo bottle = beer.drink.get(i);
            if (bottle.getName().toLowerCase().equals(countItem.toLowerCase())) {
                System.out.println("How many crates do you have?");
                amount = scanner.nextInt();
                if (amount > bottle.getAmount()) {
                    System.out.println("You already have more crates than your maximum!");
                }
                else if (amount == bottle.getAmount()) {
                    System.out.println("You already have your maximum amount of crates!");
                }
                else if (amount < bottle.getAmount()){
                    System.out.println("You need to order " + (bottle.getAmount() - amount) + " crates!");
                }
            }
        }

    }

    public void countNonAlcoholicBeer() {

        int amount;
        System.out.println("These are the non-alcoholic beers you can count");
        nonAlcoholicBeer.printArray();

        System.out.println("What non-alcoholic beers would you like to count?");
        scanner.nextLine();
        String countItem = scanner.nextLine();

        for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
            BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
            if (bottle.getName().toLowerCase().equals(countItem.toLowerCase())) {
                System.out.println("How many crates do you have?");
                amount = scanner.nextInt();
                if (amount > bottle.getAmount()) {
                    System.out.println("You already have more crates than your maximum!");
                }
                else if (amount == bottle.getAmount()) {
                    System.out.println("You already have your maximum amount of crates!");
                }
                else if (amount < bottle.getAmount()){
                    System.out.println("You need to order " + (bottle.getAmount() - amount) + " crates!");
                }
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        User user = new User();

        user.roleCall();
        menu.introductionText();

    }
}