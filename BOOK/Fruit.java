class Fruit
{
String fname;
string origin;
class Apple extends Fruit
{
Apple (String fame, String origin)
{ this.fname=fname;
this.origin=origin;
}
{
public void display ()
System.out.println(fname);
System.out.println(origin);
}
class FruitDriver1
{
public static void main(String[] args)
{
Apple a=new Apple ("Apple", "Kashmir");
a.display ();
}