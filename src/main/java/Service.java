public class Service {

    Shop market;
    Product products[];

    public Service(Shop sh, Product[] pr) {
        this.market = sh;
        this.products = pr;
        this.market.setList_avalibe_product(products);
    }
}