package basicjava;

import java.util.ArrayList;
public class Practice {
    public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>(100000000);
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(40);
    al.add(3,50);
    al.add(20);
    al.add(30);
    System.out.println(al);
    al.remove(5);
    System.out.println(al);
    al.set(3, -10);
    System.out.println(al);
    al.clear();
    System.out.println(al);
    }
} 