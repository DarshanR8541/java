package basicjava;
import java.util.Scanner;
import java.util.Arrays;
public class Buffer {
         public static void main(String[] args) {
             String st="Java is a Good programming good";
             StringBuilder sb=new StringBuilder();
             System.out.println(sb.capacity());
             sb.append(st);
             System.out.println(sb.capacity());
             System.out.println(sb.length());
             sb.insert(15, "and great ");
             System.out.println(sb);
             sb.delete(10, 19);
             System.out.println(sb);
             sb.replace(10, 15, "Good");
             System.out.println(sb);
         }
}