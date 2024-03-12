package com.assignment1;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations mathOp = new MathOperations();
		System.out.println("addition of two integers is "+ mathOp.add(1, 2));
		System.out.println("addition of three numbers of datatype double is "+ mathOp.add(1, 2));
		System.out.print("Concatenation of two strings is "+mathOp.add("Welcome To ", "Datavalley Session"));
		
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	public double add(double a, double b, double c)
	{
		return a+b+c;
	}
	public String add(String a, String b)
	{
		return a+b;
	}
}
