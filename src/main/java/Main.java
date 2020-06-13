public class Main {
    public static void main(String[] args) {

        Shop market = new Shop();
        market.setId(1);
        market.setName("aldoset");

        Product list_of_product[] = new Product[1000];
        list_of_product[0].setId(0);
        list_of_product[0].setName("alskmfalskdfg");
        list_of_product[0].setPrice(1.40);
        list_of_product[1].setId(1);
        list_of_product[1].setName("laskdmlkasmd");
        list_of_product[1].setPrice(4.46);
        list_of_product[2].setId(2);
        list_of_product[2].setName("lqwkjsjafasffff");
        list_of_product[2].setPrice(9.99);

        Service service = new Service(market, list_of_product);
    }
}