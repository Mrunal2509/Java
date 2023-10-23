1)package java2;

import java.util.*;
class Shape{
	private int width,height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
}
 class A
{
	public static void main(String args[])
	{
		Shape s=new Shape();
		s.setHeight(10);
		s.setWidth(50);
		System.out.println(s.getHeight());
		System.out.println(s.getWidth());
	}
}


2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
import java.util.*;
class MyClass
{
	private int num,num1;
	public MyClass() {
		System.out.println("in default");
	}
	public MyClass(int num) {
		System.out.println("in param int 1");
		this.num = num;
	}

	public MyClass(int num, int num1) {
		System.out.println("in param int 2");
		this.num = num;
		this.num1 = num1;
	}
}
public class Test
{
	public static void main(String args[])
	{
		MyClass m1=new MyClass();
		MyClass m2=new MyClass(10);
		MyClass m3=new MyClass(10,20);
	}
}

package java2;
/*3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?*/
public class emp
{
	private static int cnt=10;
	private int n;
	public static int getCnt() {
		return cnt;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
 class A
{
	public static void main(String args[])
	{
		emp m1=new emp();
		System.out.println(emp.getCnt());
		System.out.println(m1.getCnt());
	}
}
4)class DemoOb
{
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
}
public class Test
{
	public static void main(String args[])
	{
		DemoOb ob=new DemoOb();
		ob.setA(10);
		System.out.println(ob.getA());
		DemoOb ob1=ob;
		System.out.println(ob1.getA());
		ob1=new DemoOb();
		ob1.setA(20);
		System.out.println(ob1.getA());
	}
}
5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.
import java.util.*;
package java 2;
class A
{
	private static int b=20;
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public static int getB() {
		return b;
	}
	
}
class B{
	private static int c=10;
	private int d;
	public static int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
}
class C{
	private static int d=30;
	private int e;
	public static int getD() {
		return d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
}
public class Test
{
	public static void main(String args[])
	{
		A ob1 = new A();
		ob1.setA(50);
		System.out.println(ob1.getA());
		System.out.println(ob1.getB());
		B ob2 = new B();
		ob2.setD(80);
		System.out.println(ob2.getD());
		System.out.println(ob2.getC());
		C ob3= new C();
		ob3.setE(70);
		System.out.println(ob3.getE());
		System.out.println(ob3.getD());
	}
}


package java2;
/*6) define static initializers in the above A,B and C classes and check the order of their execution.

*/
 class a{
	static {

	System.out.println("Class A get called");
	}
}
class B{
	static {
		System.out.println("Class B get called");
	}
}
class C{
	 
	static{
		System.out.println("class c get called");
	}
	
}
public class demo99{
	public static void main(String[] args) {
		a ref1 =new a();
		B ref2 =new B();
		C ref3 =new C();
	}
}
