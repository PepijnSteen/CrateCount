import java.util.ArrayList;
import java.util.Arrays;

interface Bottle {
    ArrayList<BottleInfo> getDrink();
}

class Soda implements Bottle {

    public ArrayList<BottleInfo> getDrink() {
        return drink;
    }

    BottleInfo cocaCola = new BottleInfo("Coca Cola", 3.5);
    BottleInfo cocaColaZero = new BottleInfo("Coca Cola Zero", 3.5);
    BottleInfo sprite = new BottleInfo("Sprite", 3);
    BottleInfo spaRood = new BottleInfo("Spa Rood", 3);
    BottleInfo iceTeaGreen = new BottleInfo("Ice Tea Green", 3.2);

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(cocaCola, cocaColaZero, sprite, spaRood, iceTeaGreen));

    public void addItem(String name, double price) {
        drink.add(new BottleInfo(name, price));
    }
}

class Beer implements Bottle {
    public ArrayList<BottleInfo> getDrink() {
        return new ArrayList<>();
    }
    public void addItem(String name, double price) {
    }
}

class AlcholicBeer extends Beer {

    BottleInfo laChouffe = new BottleInfo("La Chouffe", 5.6);
    BottleInfo funkyFalcon = new BottleInfo("Funky Falcon", 5.5);
    BottleInfo deliriumTremens = new BottleInfo("Delirium Tremens", 6.5);
    BottleInfo westmalleTripel = new BottleInfo("Westmalle Tripel", 6.3);
    BottleInfo westmalleDubbel = new BottleInfo("Westmalle Dubbel", 6.0);

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(laChouffe, funkyFalcon, deliriumTremens, westmalleTripel, westmalleDubbel));

    @Override
    public ArrayList<BottleInfo> getDrink() {
        return drink;
    }

    @Override
    public void addItem(String name, double price) {
        drink.add(new BottleInfo(name, price));
    }
}

class NonAlcoholicBeer extends Beer {

    BottleInfo vrijWit = new BottleInfo("'t IJ Vrijwit", 5.6);
    BottleInfo heinekenNul = new BottleInfo("Heineken 0.0", 3.5);
    BottleInfo brandWeizenNul = new BottleInfo("Brand Weizen 0.0", 6.5);
    BottleInfo affligemBlondNul = new BottleInfo("Affligem Blond 0.0", 6.3);
    BottleInfo liefmansNul = new BottleInfo("Liefmans 0.0", 6.0);

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(vrijWit, heinekenNul, brandWeizenNul, affligemBlondNul, liefmansNul));

    @Override
    public ArrayList<BottleInfo> getDrink() {
        return drink;
    }

    @Override
    public void addItem(String name, double price) {
        drink.add(new BottleInfo(name, price));
    }
}