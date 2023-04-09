public class BottleInfo {
    private String name;
    private double price;

    public BottleInfo(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(double price) {
        this.price = price;
    }
}
