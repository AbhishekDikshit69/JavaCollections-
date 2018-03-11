//creating a linked list which inserts element in a sorted order 

import java.util.* ;

class linkedLSort{ 
	 
   public static void main(String args[])
   { int index=0 ;
   	   LinkedList  ll=new LinkedList() ;
   	   Scanner sc = new Scanner(System.in) ;
   	     int size=sc.nextInt();
   	     ll.add((Integer)sc.nextInt());size--;
   	      while(size>0){
   	      	sortedInsert(ll,(Integer)sc.nextInt());
   	      	size-- ;
   	      }
   	      System.out.println(ll);
   }
public static void sortedInsert(LinkedList li,Integer i)
{
	   Integer u=(Integer)li.getFirst();
	   ListIterator litr=li.listIterator();
	   while(u<i)
	   {
	   	 litr.next();
	   }
      li.add(litr);
}

}