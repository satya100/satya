class Test 
{
	int age;
	String name;
	public static void main(String[] args) 
	{
		Test o1=new Test();
		o1.age=18;
		o1.name="satya";

		Test o2=new Test();
		o2.age=23;
		o2.name="dipu";

		Test o3=new Test();
		o3.age=33;
		o3.name="sipu";

		Test o4=new Test();
		o4.age=26;
		o4.name="mita";

		Test o5=new Test();
		o5.age=1;
		o5.name="manish";

		
		o1.show();
		o2.show();
		o3.show();
		o4.show();
		o5.show();
	}
	public void show()
	{
		System.out.println(name+" "+age);
	}
}