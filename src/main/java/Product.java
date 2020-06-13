public class Product {

    private int id;
    private String name;
    private double price;


    public boolean validatePrice(double p) {
        if (p == 0.0)
            return false;
        else
            return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        if (validatePrice(price))
            this.price = price;
        else
            System.out.println("invalid price");
    }
}



