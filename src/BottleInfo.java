public class BottleInfo {
    private String name;
    private double price;
    private String info;

    public BottleInfo(String name, double price) {
        this(name, price, "");
    }

    public BottleInfo(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
