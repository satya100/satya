class Student2 
{
	String name;
	Student2(String name1)
	{
		name=name1;
	}
	public boolean equals(Object o)
	{
		String n1=this.name;
		Student2 s=(Student2)o;
		String n2=s.name;
		if(n1.equals(n2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		Student2 s1=new Student2("abc");
		Student2 s2=new Student2("abc");
		System.out.println(s1.equals(s2));
	}
}
