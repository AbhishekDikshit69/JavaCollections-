import java.util.* ;

class HashMapDemo{

	 public static void main(String args[])
	 {
	 	HashMap m=new HashMap();

	 	m.put("Abhishek",21);
	 	m.put("pata nahi kaun",20);
	 	m.put("Mataji","48 ki hai shayad");
	 	m.put("Baapu","52 hai senior citizen hone ko hai");

	 	System.out.println(m);
	 	Set s= m.keySet();
	 	System.out.println(s);

	 	Collection c=m.values();
	 	System.out.println(c);

	 	Set s2=m.entrySet();
	 	System.out.println(s2);

	 	Iterator i=s2.iterator();

	 	 while(i.hasNext())
	 	 {
	 	 	Map.Entry m1= (Map.Entry)i.next();

	 	 	if(m1.getKey()=="Abhishek")
	 	 		m1.setValue("Dikshit");

	 	 }
	 	 System.out.println(m);
	 }
}