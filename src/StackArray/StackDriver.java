package StackArray;

public class StackDriver {
      public static void main(String[] args) {
        StackUsingArray st=new StackUsingArray();
        System.out.println(st.capacity);
        st.push("Aravind");
        st.push("Adithiya");
        st.push("Surandar");
        st.push("Darshan");
        st.push("Ashwin");
        st.push("Abdhul");
        System.out.println((st.peek()==null)?"Underflow":st.peek());
        String res=st.pop();
        System.out.println((res==null)?"Underflow":res);
        res=st.pop();
        System.out.println((res==null)?"Underflow":res);
      }
} 