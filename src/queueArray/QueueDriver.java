package queueArray;

public class QueueDriver {
	
	      public static void main(String[] args) {
	     QueueUsingArray q=new QueueUsingArray();
	     String res=q.poll();
	     System.err.println((res==null)?"UnderFlow":res);
	     q.add("THALA");
	     q.add("AJITH KUMAR");
	     q.add("TVK");
	     q.add("VIJAY");
	     q.add("PLAY BOY");
	     q.add("ADHI");
	     res=q.poll();
	     System.out.println((res==null)?"Underflow":res);
	     res=q.poll();
	     System.out.println((res==null)?"Underflow":res);
	     res=q.poll();
	     System.out.println((res==null)?"Underflow":res);
	     res=q.poll();
	
}
}