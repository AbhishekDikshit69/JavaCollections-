import java.util.* ;

class UniqueList{
	  public static void main(String args[])
	  {             int[] array= {1,4,5,1,3,9,9,4,5,2,8,2,8};


	  	ArrayList<Integer> al=new ArrayList<Integer>();
          int len=array.length ;
          for(int i:array)
          {
            al.add(i);
          }

          distinctc(al,len);

	  }


	  public static  void  distinctc(ArrayList arr, int n)
	  {
	  	 HashSet set=new HashSet(arr) ;
	  	 System.out.println(set);

	  	 
	  }
}