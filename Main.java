package lab;

public class Main {

	public static void main(String[] args) {
		Complex num1=new Complex(2.0,4.0);
		Complex num2=new Complex(7.0,6.0);
		ComplexCalculator obj1=new ComplexCalculator(num1,num2);
		ComplexCalculator obj2=new ComplexCalculator(3.0,4.0,5.0,6.0);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	}

}
