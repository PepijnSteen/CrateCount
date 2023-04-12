import java.util.ArrayList;
import java.util.Arrays;

interface Bottle {
    void addItem(String name, double price, int amount);
    void printArray();
}

class Soda implements Bottle {
    BottleInfo cocaCola = new BottleInfo("Coca Cola", 3.5, 7);
    BottleInfo cocaColaZero = new BottleInfo("Coca Cola Zero", 3.5, 5);
    BottleInfo sprite = new BottleInfo("Sprite", 3, 5);
    BottleInfo spaRood = new BottleInfo("Spa Rood", 3, 6);
    BottleInfo iceTeaGreen = new BottleInfo("Ice Tea Green", 3.2, 8);

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(cocaCola, cocaColaZero, sprite, spaRood, iceTeaGreen));

    @Override
    public void addItem(String name, double price, int amount) {
        drink.add(new BottleInfo(name, price, amount));
    }

    @Override
    public void printArray() {
        for (int i = 0; i <drink.size(); i++) {
            System.out.println(drink.get(i).toString());
        }
    }
}

class Beer implements Bottle {
    public void addItem(String name, double price, int amount) {
    }
    public void printArray() {
    }
}

class AlcholicBeer extends Beer {

    BottleInfo laChouffe = new BottleInfo("La Chouffe", 5.6, 5);
    BottleInfo funkyFalcon = new BottleInfo("Funky Falcon", 5.5, 4);
    BottleInfo deliriumTremens = new BottleInfo("Delirium Tremens", 6.5, 7);
    BottleInfo westmalleTripel = new BottleInfo("Westmalle Tripel", 6.3, 5);
    BottleInfo westmalleDubbel = new BottleInfo("Westmalle Dubbel", 6.0,4);

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(laChouffe, funkyFalcon, deliriumTremens, westmalleTripel, westmalleDubbel));

    @Override
    public void addItem(String name, double price, int amount) {
        drink.add(new BottleInfo(name, price, amount));
    }

    @Override
    public void printArray() {
        for (int i = 0; i < drink.size(); i++) {
            System.out.println(drink.get(i).toString());
        }
    }
}

class NonAlcoholicBeer extends Beer {

    BottleInfo vrijWit = new BottleInfo("'t IJ Vrijwit", 5.6, 3);
    BottleInfo heinekenNul = new BottleInfo("Heineken 0.0", 3.5, 2);
    BottleInfo brandWeizenNul = new BottleInfo("Brand Weizen 0.0", 6.5, 2);
    BottleInfo affligemBlondNul = new BottleInfo("Affligem Blond 0.0", 6.3, 3);
    BottleInfo liefmansNul = new BottleInfo("Liefmans 0.0", 6.0, 1);

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(vrijWit, heinekenNul, brandWeizenNul, affligemBlondNul, liefmansNul));

    @Override
    public void addItem(String name, double price, int amount) {
        drink.add(new BottleInfo(name, price, amount));
    }

    @Override
    public void printArray() {
        for (int i = 0; i < drink.size(); i++) {
            System.out.println(drink.get(i).toString());
        }
    }
}