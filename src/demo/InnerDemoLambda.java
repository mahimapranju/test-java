package demo;

@FunctionalInterface
interface D{
	void show();
}

public class InnerDemoLambda {

	//lambda expression- kind of anonymous class but no need to create class
	public static void main(String[] args) {
		D obj = () -> System.out.println("Hello");
		obj.show();	
	}

}
