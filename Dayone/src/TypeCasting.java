//program to demonstrate TypeCasting
public class TypeCasting {

	public static void main(String[] args) {
		//widening / implicit
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 12.66f;
		double d  = f;
		System.out.println(d);
		
		char var1  = '\u00A7';
		int i2  = var1;
		System.out.println(i2);
		
		//narrowing explicit
		double d1 = 658795.988d;
		float f1 = (float)d1;
		System.out.println(f1);
		
		byte b1 = 67;
		char ch1 = (char)b1;
		System.out.println(ch1);

	}

}
