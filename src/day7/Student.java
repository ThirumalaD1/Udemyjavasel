package day7;

public class Student {
	int sid;
	String sname;
	char grade;

	void show()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	void setdata(int id, String name, char g)
	{
		sid=id;
		sname=name;
		grade=g;
		
				
	}
	/*Student(int id,String name, char g)
	{
		
		sid=id;
		sname=name;
		grade=g;
		
	}*/
	
	
	
}
