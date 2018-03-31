import java.util.* ;
class employee implements Comparable<employee>{
	 String ename;
	 int sal;
	 int age ;

	 public employee(String ename,int sal,int age)
	 { 
	 	this.ename=ename;
	 	this.sal=sal;
	 	this.age=age;

	 }
  public int compareTo(employee st)
   {
   	 if(sal==st.sal)
   	 	return 0;
   	 else if(sal>st.sal)
   	 	return 1;
   	 else return -1;
   }


public static void main(String args[])
{
	ArrayList<employee> al=new ArrayList<employee>();
	al.add(new employee("Aron",1000000,21));
	al.add(new employee("Alex",500000,23));
	al.add(new employee("Steven",100,54));
al.add(new employee("Mark",10000,54));
	    Collections.sort(al);

	for(employee x1:al)
	{
		System.out.println(x1.sal);
	}




}


}

