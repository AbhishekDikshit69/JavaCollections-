import java.util.* ;
class  listiteratordemo{
	  public static void main(String args[])
	  {
	  	   LinkedList l= new LinkedList() ;
	  	   l.add("abhishek") ;
	  	   l.add("avishkar") ;
	  	   l.add("thakur") ;
	  	   l.add("random0") ;	 
	  	   l.add("random1") ;
             
             System.out.println(l) ;
	  	   ListIterator ltr=l.listIterator() ;
	  	   while(ltr.hasNext())
	  	   {
	  	   	  String s= (String)ltr.next() ;
	  	   	    if(s=="abhishek")
	  	   	    {
	  	   	       ltr.set("dikshit")  ;
	  	   	    }
	  	   	    if(s=="avishkar")
	  	   	    {
	  	   	    	ltr.add("kumar") ;

	  	   	    }
	  	   	      if(s=="thakur")
	  	   	      {
	  	   	      	ltr.remove() ;
	  	   	      }
	  	   }
	  	   System.out.println(l) ;


	  	    }
}