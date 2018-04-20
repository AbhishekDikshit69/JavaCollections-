import java.util.* ;

class TreeSetDemo1{


public static void main(String args[])
{
	TreeSet t=new TreeSet();
	t.add('A');
	t.add('a');
	t.add('b');
	t.add('L');
	t.add('c');
	// t.add(1);
	t.add(null);

	System.out.println(t);
}}
