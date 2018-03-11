import java.util.* ;
class vectordemo{

public static void main(String args[])
{    Vector l=new Vector() ;
	System.out.println(l.capacity()) ;
     for(int i=0;i<l.capacity();i++)
     {
       l.addElement(i) ;
     }
	System.out.println(l) ;
      l.addElement("bazunga") ;
     	System.out.println(l.capacity()) ;
     	System.out.println(l.size());
}

}