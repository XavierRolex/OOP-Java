package lab;

public class ComplexCalculator {
private Complex comNum1;
private Complex comNum2;

ComplexCalculator(Complex comNum1,Complex comNum2)
{
	this. comNum1= comNum1;
	this. comNum2= comNum2;
}
ComplexCalculator(double real1,double imaginary1,double real2,double imaginary2)
{
	comNum1=new Complex(real1,imaginary1);
	comNum2=new Complex(real2,imaginary2);
}
//Complex n1= new Complex();
public Complex add()
{
	Complex n1= new Complex();
	double re=comNum1.getReal()+(comNum2.getReal());
	double im=comNum2.getImaginary()+(comNum2.getImaginary());
	
	n1.setReal(re);
	n1.setImaginary(im);
	return n1;
}
//Complex n2= new Complex();
public Complex multiple()
{
	Complex n2= new Complex();
	double re=(comNum1.getReal()*(comNum2.getReal()))-(comNum1.getImaginary()*(comNum2.getImaginary()));
	double im=(comNum1.getReal()*(comNum2.getImaginary()))+(comNum1.getImaginary()*(comNum2.getReal()));
	
	n2.setReal(re);
	n2.setImaginary(im);
	return n2;
}
public String toString()
{
	return comNum1.toString()+"\n"+comNum2.toString()+"\nthe summation is "+add()+"\nthe multiplication "+multiple();
}
}
