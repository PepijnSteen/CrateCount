import java.util.ArrayList;
import java.util.Scanner;

class Addition {
    private String name;
    private double price;
    public void addNewCrates(ArrayList<BottleInfo> drink) {
        Scanner scanner = new Scanner(System.in);

        Soda soda = new Soda();
        AlcholicBeer beer = new AlcholicBeer();
        NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

        System.out.println("What new drink are you adding?");
        name = scanner.nextLine();

        System.out.println("What's the price of the " + name + "?");
        price = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Is " + name + " a:" +
                           "1. Soda \n 2. Beer \n 3. Non-Alcoholic Beer \n Please enter either 1, 2 or 3");

        switch (scanner.nextInt()) {
            case 1:
                soda.addItem(name, price);
            case 2:
                beer.addItem(name, price);
            case 3:
                nonAlcoholicBeer.addItem(name, price);
        }
    }
}

class Removal {
    private String name;
    public void removeItem(ArrayList<BottleInfo> drink) {
        Scanner scanner = new Scanner(System.in);

        Soda soda = new Soda();
        AlcholicBeer beer = new AlcholicBeer();
        NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

        System.out.println("What drink do you want to remove??");
        name = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Is " + name + " a:" +
                "1. Soda \n 2. Beer \n 3. Non-Alcoholic Beer \n Please enter either 1, 2 or 3");
        switch (scanner.nextInt()) {
            case 1:
                for (int i = 0; i < soda.drink.size(); i++) {
                    BottleInfo bottle = soda.drink.get(i);
                    if (bottle.getName().equals(name)) {
                        soda.drink.remove(i);
                        break;
                    }
                }
            case 2:
                for (int i = 0; i < beer.drink.size(); i++) {
                    BottleInfo bottle = beer.drink.get(i);
                    if (bottle.getName().equals(name)) {
                        beer.drink.remove(i);
                        break;
                    }
                }
            case 3:
                for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
                    BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
                    if (bottle.getName().equals(name)) {
                        nonAlcoholicBeer.drink.remove(i);
                        break;
                    }
                }
        }
    }
}

class Edit {
    private String name;
    public void removeItem(ArrayList<BottleInfo> drink) {
        Scanner scanner = new Scanner(System.in);

        Soda soda = new Soda();
        AlcholicBeer beer = new AlcholicBeer();
        NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

        System.out.println("What drink do you want to edit??");
        name = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Is " + name + " a:" +
                "1. Soda \n 2. Beer \n 3. Non-Alcoholic Beer \n Please enter either 1, 2 or 3");
        switch (scanner.nextInt()) {
            case 1:
                for (int i = 0; i < soda.drink.size(); i++) {
                    BottleInfo bottle = soda.drink.get(i);
                    if (bottle.getName().equals(name)) {
                        System.out.print("Please enter the (new) name:");
                        String newName = scanner.nextLine();
                        System.out.println("\nPlease enter the (new) price");
                        double newPrice = scanner.nextDouble();
                        bottle.setName(newName);
                        bottle.setPrice(newPrice);
                        break;
                    }
                }
            case 2:
                for (int i = 0; i < beer.drink.size(); i++) {
                    BottleInfo bottle = beer.drink.get(i);
                    if (bottle.getName().equals(name)) {
                        System.out.print("Please enter the (new) name:");
                        String newName = scanner.nextLine();
                        System.out.println("\nPlease enter the (new) price");
                        double newPrice = scanner.nextDouble();
                        bottle.setName(newName);
                        bottle.setPrice(newPrice);
                        break;
                    }
                }
            case 3:
                for (int i = 0; i < nonAlcoholicBeer.drink.size(); i++) {
                    BottleInfo bottle = nonAlcoholicBeer.drink.get(i);
                    if (bottle.getName().equals(name)) {
                        System.out.print("Please enter the (new) name:");
                        String newName = scanner.nextLine();
                        System.out.println("\nPlease enter the (new) price");
                        double newPrice = scanner.nextDouble();
                        bottle.setName(newName);
                        bottle.setPrice(newPrice);
                        break;
                    }
                }
        }
    }
}

class Count {

}

class CrateChoice {
    public void Choice(String action) {
        Scanner scanner = new Scanner(System.in);
        Soda soda = new Soda();
        AlcholicBeer beer = new AlcholicBeer();
        NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();


        System.out.println("What type of crate would you like to " + action + "?\n" +
                           "1. Soda \n " +
                           "2. Beer \n " +
                           "3. Non-Alcoholic \n " +
                           "Please enter one of the 3 numbers");
        switch (scanner.nextInt()) {
            case 1:
                soda.getDrink();
            case 2:
                beer.getDrink();
            case 3:
                nonAlcoholicBeer.getDrink();
            default:
                // ??
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}