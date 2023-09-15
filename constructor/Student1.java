class Student1 
{
	String name;
	Student1 (String name1)
	{
		name=name1;
	}
	public String toString()
	{
		return name;
	}
	public static void main(String[] args) 
	{
		Student1 s1=new Student1("abc");
		Student1 s2=new Student1("abc");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
