//program to demonstrate range of Datatypes
public class DatatypesDemo {

	public static void main(String[] args) {
		//byte takes 1 byte
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println(" Min range of byte is " +byteMin+ " Max range of byte is "+byteMax);
		
		//short - 2 bytes
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println(" Min range of short is "+shortMin+" Max range of byte is "+shortMax);
		
		//int - 4 bytes
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println(" Min range of int is "+minInt+" Max range of byte is "+maxInt);
		
		//long - 8 bytes
		long maxLong = 2147483647L;
		long minLong = -2147483648L;
		System.out.println(" Min range of long is "+minLong+" max range of long is "+maxLong);
		
		//float
		float f = 3234.141243278456f;
		//double
		double d = 3456.1412412345678902345678914d;
		System.out.println(" float value is "+f+" double value is "+d);
		//boolean
		boolean flag = false;//default value
		System.out.println(" boolen value "+flag);
	}
}
