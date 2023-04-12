public class BottleInfo {
    private String name;
    private double price;
    private int amount;

    public BottleInfo(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    @Override
    public String toString() {
        return "name= '" + name + '\'' +
                ", price= " + price +
                ", amount= " + amount ;
    }
}
