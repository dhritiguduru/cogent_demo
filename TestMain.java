package cogent.day3;

class Test11{
	int i =10;
	static int j = 20;
	void test1() {
		System.out.println("I am from test1");
	}
	static void test2() {
		System.out.println("I am from test2");
	}
}
public class TestMain {

	public static void main(String[] args) {
		Test11 t1 = new Test11();
		System.out.println(t1.i);
		System.out.println(Test11.j);
		
		t1.test1();
		Test11.test2();
		TestMain t2 = new TestMain();
		t2.main2();
		

	}
	void main2() {
		Test11 t1 = new Test11();
		System.out.println(t1.i);
		System.out.println(Test11.j);
		
		t1.test1();
		Test11.test2();
		
	}

}
