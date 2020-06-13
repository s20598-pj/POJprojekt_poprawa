public class Customer {

    private int id;
    private String[] buying_list;

    public Customer(int id, String[] buying_list) {
        this.id = id;
        this.buying_list = buying_list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getBuying_list() {
        return buying_list;
    }

    public void setBuying_list(String[] buying_list) {
        this.buying_list = buying_list;
    }
}
