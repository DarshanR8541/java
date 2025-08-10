package DSlist;

public class Rec {
    int rec(int num) {
        if (num == 0) {
            System.out.println(num);
            return num;
        }
        System.out.println(num);
        return rec(num - 1); 
    }

    public static void main(String[] args) {
        int num = 3;
        Rec r = new Rec();
        int res = r.rec(num);
    }
}