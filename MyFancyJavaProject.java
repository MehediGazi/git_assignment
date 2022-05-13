public class MyFancyJavaProject {

	public static void main(String[] args){
		System.out.print("Hello World");

		calFactory calFactory = new calFactory();
		
		Calculator calc1 = calFactory.getCalc("ADD");

		calc1.calculate();

		Calculator calc2 = calFactory.getCalc("SUB");

		calc2.calculate();
	}
}

public class calFactory{

	public Calculator getCalc(String calType){

		if(calType == null){
			return null;
		}		
		if(calType.equalsIgnoreCase("ADD")){
			return new Add();
		 
		}else if(calType.equalsIgnoreCase("SUB")){
			return new Sub();
		}

		return null;
	}
}

public class Add implements calFactory {

   @Override
   public void calculate() {
      System.out.println("Inside Add::calculate() method.");
   }
}

public class Sub implements calFactory {

   @Override
   public void calculate() {
      System.out.println("Inside Sub::calculate() method.");
   }
}

public interface Calculator {
   void calculate();
}
