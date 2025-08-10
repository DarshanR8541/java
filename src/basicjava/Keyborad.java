package basicjava;
import java.util.*;

public class Keyborad {
    boolean keyboardverify(String st) {
        String[] stArr = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        if (st == null || st.isEmpty()) return false;
        char ch = st.charAt(0);
        int rowIndex = -1;
        for (int i = 0; i < stArr.length; i++) {
            if (stArr[i].indexOf(ch) >= 0) { rowIndex = i; break; }
        }
        if (rowIndex == -1) return false;
        for (int i = 1; i < st.length(); i++) {
            if (stArr[rowIndex].indexOf(st.charAt(i)) == -1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
    	
        Keyborad kb = new Keyborad();
        System.out.println(kb.keyboardverify("qwerty"));
        System.out.println(kb.keyboardverify("ASDF"));
        System.out.println(kb.keyboardverify("Hello"));
    }

}


