package com.ty;

public class Calculator {
	public void add(int n1,int n2)
	{
		int n=n1+n2;
		System.out.println(n);
	}
	public void sub(int n1,int n2)
	{
		int n=n1-n2;
		System.out.println(n);
	}
	public void div(int n1,int n2)
	{
		int n=n1/n2;
		System.out.println(n);
	}

	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		// TODO Auto-generated method stub
		calculator.add(5, 4);
		calculator.sub(5, 4);
		calculator.div(20, 10);
	}

}
