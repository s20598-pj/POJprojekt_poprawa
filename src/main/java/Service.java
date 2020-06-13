import java.util.Optional;

public class Service {

    Shop market;
    Product products[];

    public Service(Shop sh, Product[] pr) {
        this.market = sh;
        this.products = pr;
        this.market.setList_avalibe_product(products);
    }

//    private Optional<Product> findProductInShop(final int productId) {
//        return products.stream().filter(products -> products.getId() == productId).findFirst(); //coś mi sięnie udało :(
    }
}