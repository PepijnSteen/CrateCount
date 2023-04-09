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

    public void addItem(String name, double price, String info) {

    }
}

class Beer implements Bottle {
    public ArrayList<BottleInfo> getDrink() {
        return new ArrayList<>();
    }
    public void addItem(String name, double price, String info) {

    }
}

class AlcholicBeer extends Beer {

    BottleInfo laChouffe = new BottleInfo("La Chouffe", 5.6, "A heavy blonde Belgian beer");
    BottleInfo funkyFalcon = new BottleInfo("Funky Falcon", 5.5, "A citrus, lemongrass and floral flavoured pale ale");
    BottleInfo deliriumTremens = new BottleInfo("Delirium Tremens", 6.5, "A slightly malty pale blond beer");
    BottleInfo westmalleTripel = new BottleInfo("Westmalle Tripel", 6.3, "A tripel beer with a mild bitter taste, supported by fruity aromas");
    BottleInfo westmalleDubbel = new BottleInfo("Westmalle Dubbel", 6.0, "A dark red-brown dubbel beer with touches of caramel, malt and fruity esters reminiscent of ripe banana");

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(laChouffe, funkyFalcon, deliriumTremens, westmalleTripel, westmalleDubbel));

    @Override
    public ArrayList<BottleInfo> getDrink() {
        return drink;
    }

    @Override
    public void addItem(String name, double price, String info) {

    }
}

class NonAlcoholicBeer extends Beer {

    BottleInfo vrijWit = new BottleInfo("'t IJ Vrijwit", 5.6, "Brewed with lemon and coriander seed for a spicy, fresh taste.");
    BottleInfo heinekenNul = new BottleInfo("Heineken 0.0", 3.5, "Heineken 0.0% has a perfectly balanced taste with refreshing fruity notes and soft malty body");
    BottleInfo brandWeizenNul = new BottleInfo("Brand Weizen 0.0", 6.5, "A delicious 0.0% wheat beer with an extra fresh, fruity taste and a soft aftertaste");
    BottleInfo affligemBlondNul = new BottleInfo("Affligem Blond 0.0", 6.3, "An alcohol-free Belgian blond abbey beer with a rich taste, a soft fruitiness and a mildly bitter aftertaste");
    BottleInfo liefmansNul = new BottleInfo("Liefmans 0.0", 6.0, "A cherry beer with a fruity bouquet of kriek, raspberry, blueberry, elderberry and strawberry.");

    ArrayList<BottleInfo> drink = new ArrayList<>(Arrays.asList(vrijWit, heinekenNul, brandWeizenNul, affligemBlondNul, liefmansNul));

    @Override
    public ArrayList<BottleInfo> getDrink() {
        return drink;
    }

    @Override
    public void addItem(String name, double price, String info) {

    }
}