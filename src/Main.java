import java.util.ArrayList;
import java.util.Scanner;

interface Role {
    void checkRole();
}

class Addition implements Role {
    private String name;
    private double price;
    private boolean manager = false;

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }

    public void addNewCrates(ArrayList<BottleInfo> drink, Scanner scanner) {
        //checkRole();
        User user = new User();
        Soda soda = new Soda();
        AlcholicBeer beer = new AlcholicBeer();
        NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

        if (user.isManager()) {
            System.out.println("You are unauthorized to use this feature!");
        }

        while (true) {
            boolean breakloop = false;
            int choice;
            switch (scanner.nextInt()) {
                case 1:
                    soda.addItem(name, price);
                    System.out.println(soda.getDrink());
                    breakloop = true;
                    break;
                case 2:
                    beer.addItem(name, price);
                    System.out.println(beer.getDrink());
                    breakloop = true;
                    break;
                case 3:
                    nonAlcoholicBeer.addItem(name, price);
                    System.out.println(nonAlcoholicBeer.getDrink());
                    breakloop = true;
                    break;
            }
            if (breakloop) { break; }
        }
    }
}

class Removal  implements Role{
    private String name;
    boolean manager = false;

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }
    public void removeItem(ArrayList<BottleInfo> drink) {
        checkRole();
        if (!manager) {
            System.out.println("You are unauthorized to use this feature!");
        }

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

class Edit  implements Role{
    private String name;
    boolean manager = false;

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }
    public void editItem(ArrayList<BottleInfo> drink) {
        checkRole();
        if (!manager) {
            System.out.println("You are unauthorized to use this feature!");
        }

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

class Count  implements Role{
    boolean manager = false;

    public void checkRole(){
        User user = new User();
        if (user.isManager()) {
            manager = true;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        User user = new User();
        Soda soda = new Soda();
        AlcholicBeer beer = new AlcholicBeer();
        NonAlcoholicBeer nonAlcoholicBeer = new NonAlcoholicBeer();

        user.roleCall();
        menu.optionsMenu();

    }
}