import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {

    public static void Market() {
        int id;
        String name;
        String[] list_avalibe_product;
        String[] sell_list;
    }

    public boolean validate(String n) {
        Pattern p = Pattern.compile("[^0-9]{6}[^0-9]*\n");
        Matcher m = p.matcher(n);
        boolean b = m.matches();
        return b;
    }
}
