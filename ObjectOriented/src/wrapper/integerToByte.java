package wrapper;

public class integerToByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = Integer.parseInt(args[0]);
		String nu = "67";
		int num = Integer.parseInt(nu);
		System.out.println("Number : " + num);
		System.out.println("Binary : " + Integer.toBinaryString(num));
		System.out.println("HexaDecimal : " + Integer.toHexString(num));
		System.out.println("Octal : " + Integer.toOctalString(num));

	}

}
