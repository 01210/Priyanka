package constructoroverloading;

public class ConstOver {

	public static void main(String[] args) {
		Abc obj=new Abc(5);
		

	}

}
class Abc{
	public Abc()
	{
		System.out.println("Hello");
	}
	public Abc(int i)
	{
		System.out.println("Hello world");
	}
	
	
}