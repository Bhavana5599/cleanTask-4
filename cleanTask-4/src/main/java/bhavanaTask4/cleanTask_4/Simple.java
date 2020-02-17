package bhavanaTask4.cleanTask_4;

import java.util.Scanner;

public class Simple {
	static
	{
		float p=0,t=0,r=0;
		float s=0,A=0,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.format("enter values of p:");
		p=sc.nextFloat();
		System.out.format("enter values of t in years only:");
		t=sc.nextFloat();
		System.out.format("enter values of r:");
		r=sc.nextFloat();
		System.out.format("enter values of n:");
		s=(p*t*r)/100;
		System.out.printf("%f",s);
		A=(float) (p*(Math.pow((1+(r/n)),(n*t))));
		System.out.printf("%f",A);
		System.exit(0);
	}

}
