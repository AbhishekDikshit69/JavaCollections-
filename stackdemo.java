import java.util.* ;
class stackdemo{

	   public static void main(String args[])
	   {
	   	    Stack s=new Stack();
	   	    s.push(10);
	   	    s.push(23);
	   	    s.push(34);
	   	    System.out.println(s);
	   	    System.out.println(s.search(23)) ;
	   	    System.out.println(s.search(40)) ;
	   	    s.pop() ;
	   	    System.out.println(s);
	   	    System.out.println(s.empty());
	   	    		   }
	   	    		}