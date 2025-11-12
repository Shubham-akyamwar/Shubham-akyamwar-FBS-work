class shape
{
	void area(double base, double height){
	double area = 0.8 * base * height;
	System.out.println("area of triangle:" + area);
}
	void area (int lenghth, int breadth){
	int area = lenghth * breadth;
	System.out.println("area of rectangle:" + area);
}
	void area(double radius){
	double area =3.14 * radius * radius;
	System.out.println("area of radius:" + area);
  }
} // class end here

class TestShape
{
    public static void main(String[] args){
	shape s1;
	s1=new shape();
	s1.area (10.5,20.5);
	s1.area (10,20);
	s1.area (10.0);
   }
}
