package basicjava;
import java.util.HashMap;
public class Summa {
    public static void main(String[] args) {
        HashMap<Integer, String> s = new HashMap<>();
        s.put(22, "Ak");
        s.put(17, "TVK");
        s.put(19, "ashwin");
        s.put(2, "ajith");
        s.put(5, "");
        System.out.println(s);
        System.out.println(s.get(2));
        System.out.println(s.get(22));
        

    }
}