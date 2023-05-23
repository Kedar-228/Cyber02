package ObjectClass;

public class ExampleEx {
	ExampleEx(){
 int a=100;
char ch='a';
	}
public class kedar extends ExampleEx{
	kedar(){
		String s="kulkarni";
	}
	
}
	public static void main(String[] args) {
		ExampleEx ref=new ExampleEx();
	System.out.println("toStraing method "+ref);
         ExampleEx ref1=new ExampleEx();
         System.out.println( "Equels method  "+ref.equals(ref1));
         
         System.out.println("hashcode method "+ref.hashCode());
       
	}

}
