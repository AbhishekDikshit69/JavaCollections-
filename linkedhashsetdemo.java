import java.util.* ;
class linkedhashsetdemo{

	public static void main(String args[])
	{
		   LinkedHashSet lhs=new LinkedHashSet();

		  for(int i=10;i<100;i+=10)
		  {
		  	lhs.add(i);
		  }
		  System.out.println(lhs);
	}
}