import java.util.* ;

class LinkedListlast{
	  public static void main(String args[])
	  {             int[] array= {1,4,5,1,3,9,9,4,5,2,8,2,8};


	  	LinkedList<Integer> al=new LinkedList<Integer>();
          int len=array.length ;
          for(int i:array)
          {
            al.add(i);
          }
           ListIterator li=al.listIterator();
           while(li.hasNext())
           {
           	 System.out.println(li.next());
           }
           li.add(75);
           System.out.println(li);
          System.out.println(al);
          System.out.println(al.getLast()) ;
      }}

	  