class Student
{
	String name;
	int id;
	Student (String name1,int id1)
	{
		name=name1;
		id=id1;
	}
	public String toString()
	{
		return name+" "+id;
	}
	public static void main(String [] args)
	{
		Student s1 = new Student("abc",10);
		Student s2 = new Student("mno",25);
		System.out.println(s1);
		System.out.println(s2);
	}
}