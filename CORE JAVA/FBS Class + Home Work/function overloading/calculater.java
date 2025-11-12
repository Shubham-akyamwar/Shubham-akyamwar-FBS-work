class calculater {
	
	void add(int a,int b){
	System.out.println("fun1");
	System.out.println(a+b);
}
	void add(double a,double b){
	System.out.println("fun2");
	System.out.println(a+b);
}
	void add(double a, int b){
	System.out.println("fun3");
	System.out.println(a+b);
}
	void add(int a, double b){
	System.out.println("fun4");
	System.out.println(a+b);
   }
	void sub(int a,int b){
	System.out.println("fun1");
	System.out.println(a-b);
}
	void sub(double a,double b){
	System.out.println("fun2");
	System.out.println(a-b);
}
	void sub(double a, int b){
	System.out.println("fun3");
	System.out.println(a-b);
}
	void sub(int a, double b){
	System.out.println("fun4");
	System.out.println(a-b);
   }

	void mul(int a,int b){
	System.out.println("fun1");
	System.out.println(a*b);
}
	void mul(double a,double b){
	System.out.println("fun2");
	System.out.println(a*b);
}
	void mul(double a, int b){
	System.out.println("fun3");
	System.out.println(a*b);
}
	void mul(int a, double b){
	System.out.println("fun4");
	System.out.println(a*b);
   }

	void div(int a,int b){
	System.out.println("fun1");
	System.out.println(a/b);
}
	void div(double a,double b){
	System.out.println("fun2");
	System.out.println(a/b);
}
	void div(double a, int b){
	System.out.println("fun3");
	System.out.println(a/b);
}
	void div(int a, double b){
	System.out.println("fun4");
	System.out.println(a/b);
   }



}

class TestCalculater
{
	public static void main(String [] args){
	calculater c1;
	c1=new calculater();
	c1.add (10,10);
	c1.add (10.5,20.3);
	c1.add (20.6,20);
	c1.add (10,50.6);
	
	c1.sub (10,10);
	c1.sub (10.5,20.3);
	c1.sub (20.6,20);
	c1.sub (10,50.6);

	c1.mul (10,10);
	c1.mul (10.5,20.3);
	c1.mul (20.6,20);
	c1.mul (10,50.6);

	c1.div (10,10);
	c1.div (10.5,20.3);
	c1.div (20.6,20);
	c1.div (10,50.6);

   }
}