package StringClass;

final public class immutableclass0 {
final int num;
final String name;
immutableclass0(int num1,String name1){
	num=num1;
	name=name1;
}
public int getnum() {
	return num;
}
public String getname() {
	return name;
}
	public static void main(String[] args) {
		immutableclass0 ref=new immutableclass0(100,"kedar");
		System.out.println(ref.getnum());
		System.out.println(ref.getname());
	}

}
