class Studentp 
{
	private String name;
	private int  id;
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name1)
	{
		name=name1;
	}
	public void setId(int id1)
	{
		id=id1;
	}
}
class Student
{
	public static void main(String args[])
	{
		Studentp s1=new Studentp();
		s1.setName("satya");
		s1.setId(10);

		Studentp s2=new Studentp();
		s2.setName("dipu");
		s2.setId(20);

		System.out.println(s1.getName()+" "+s1.getId());
		System.out.println(s2.getName()+" "+s2.getId());
	}
}