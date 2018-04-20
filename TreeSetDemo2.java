import java.util.* ;

class TreeSetDemo2{


public static void main(String args[])
{
	TreeSet t=new TreeSet(new mycomparator());
	t.add(10);
	t.add(2);
	t.add(29);
	t.add(4);
	t.add(4);
	// t.add(1);

	System.out.println(t);
}}

class mycomparator implements Comparator{

	public int compare(Object obj1,Object obj2){

	Integer i= (Integer)obj1;
	Integer j= (Integer)obj2 ;

	if(i < j)
		return +1 ;
	else if(i>j)
		return -1 ;
	else return 0;
// alternate way return j.compareTo(i)
	// we can also use -i.compareTo(j), simply the negetion of asscending order
	}
}