import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {
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
        validateName(name);
        this.name = name;
    }

    public String[] getList_avalibe_product() {
        return list_avalibe_product;
    }

    public void setList_avalibe_product(String[] list_avalibe_product) {
        this.list_avalibe_product = list_avalibe_product;
    }

    public String[] getSell_list() {
        return sell_list;
    }

    public void setSell_list(String[] sell_list) {
        this.sell_list = sell_list;
    }

        private int id;
        private String name;
        private String[] list_avalibe_product;
        private String[] sell_list;


    public boolean validateName(String n) {
        Pattern p = Pattern.compile("[^0-9]{6}[^0-9]*\n");
        Matcher m = p.matcher(n);
        boolean b = m.matches();
        return b;
    }
}
