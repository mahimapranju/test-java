package demo;

class Employee{
	  @Override
	  public void finalize(){
	  System.out.println("Finallize method got called");
	  }
	}
	class Test{
	 @Override
	 public void finalize(){
	  System.out.println("Finallize method got called");
	  }
	public static void main(String[] args){

	Employee emp=new Employee();
	String str=new String("Abc");
	System.gc();
	}
	}
