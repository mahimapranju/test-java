package demo;

import java.util.ArrayList;

class A
{
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("in A");
	}
}
class B extends A
{
	@Override  //annotation
	@SuppressWarnings("unused")
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("in B");
	}
}
public class AnnotationDemo {

	public static void main(String[] args) {
		B obj = new B();
		@SuppressWarnings("unused")
		ArrayList<Integer> arr = new ArrayList<Integer>();
		obj.showMyDataFromLastYearDatabase();
	}

}
