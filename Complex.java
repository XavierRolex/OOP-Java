package lab;

public class Complex {
private double real;
private double imaginary;

Complex()
{
	
}
Complex(double real,double imaginary)
{
	this.real=real;
	this.imaginary=imaginary;
}
public String toString()
{
	return "The number is :"+real+" + "+imaginary+"i";
}
public double getReal() {
	return real;
}
public void setReal(double real) {
	this.real = real;
}
public double getImaginary() {
	return imaginary;
}
public void setImaginary(double imaginary) {
	this.imaginary = imaginary;
}

}
