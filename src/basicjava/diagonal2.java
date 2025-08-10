package basicjava;
import java.util.Arrays;
import java.util.Scanner;
public class diagonal2 {
	  public static void main(String[] args) {
		  String st="java is a good programming language";
		  String res="";
		  for(int i=0;i<st.length();i++){
		  char ch=st.charAt(i);
		  res = ch+res;

		  System.out.println(res);
	  }
}
}