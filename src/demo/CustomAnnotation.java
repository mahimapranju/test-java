package demo;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//marker annotation
//single value annotation
//multi value annotation
//meta annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface SmartPhone
{
	String os() default "Symbian";
	int version() default 1;
}
@SmartPhone(os="Android",version=6)
class NokiaASeries
{
	String model;
	int size;
	
	public NokiaASeries(String model, int size) {
		this.model=model;
		this.size=size;
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		NokiaASeries obj = new NokiaASeries("Fire",5);
		
		Class c = obj.getClass();
		@SuppressWarnings("unchecked")
		Annotation an = c.getAnnotation(SmartPhone.class);
		SmartPhone s = (SmartPhone)an;
		System.out.println(s.os());
		System.out.println(s.version());

	}

}
