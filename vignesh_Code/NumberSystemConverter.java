import java.util.*;

/**
 * Convert One Types of Number System to another Type of Number System
 * @author Vignesh G
 * @version 1.0
 */
public class NumberSystemConverter {
	/**
	 * Convert Decimal Integer into a Binary String
	 * Remainder of Division operation by 2
	 * @param n Decimal number is passed as Input
	 * @return Decimal is converted into a Binary String
	 */
	public static String decimalToBinary(int n) {
		String rem = "";
		while (n != 0) {
			rem = (n % 2) + rem;
			n = n / 2;
		}
		return rem;
	}

	/**
	 * Convert Decimal Integer into a Octal String
	 * Remainder of Division operation by 8
	 * @param n Decimal number is passed as Input
	 * @return Decimal is converted into a Octal String
	 */
	public static String decimalToOctal(int n) {
		String rem = "";
		while (n != 0) {
			rem = (n % 8) + rem;
			n = n / 8;
		}
		return rem;
	}

	/**
	 * Convert Decimal Integer into a Hexadecimal String
	 * Remainder of Division operation by 16
	 * If..Else is used as the hexadecimal has A-F after 10
	 * @param n Decimal number is passed as Input
	 * @return Decimal is converted into a Hexadecimal String
	 */
	public static String decimalToHexadecimal(int n) {
		String rem = "";
		while (n != 0) {
			if (n % 16 == 10)
				rem = 'A' + rem;
			else if (n % 16 == 11)
				rem = 'B' + rem;
			else if (n % 16 == 12)
				rem = 'C' + rem;
			else if (n % 16 == 13)
				rem = 'D' + rem;
			else if (n % 16 == 14)
				rem = 'E' + rem;
			else if (n % 16 == 15)
				rem = 'F' + rem;
			else
				rem = (n % 16) + rem;
			n = n / 16;
		}
		return rem;
	}

	/**
	 * Check if the given number is a perfect Binary Number
	 * @param n Integer n is passed  in as Input
	 * @return Boolean value is returned as output
	 */
	public static boolean isBinary(int n) {
		int dig = 0;
		while (n != 0) {
			dig = n % 10;
			if (dig > 1)
				return false;
			n = n / 10;
		}
		return true;

	}

	/**
	 * Convert Binary Integer to Decimal String
	 * @param n Integer n is passed in as Input
	 * @return Decimal value is returned as output
	 */
	public static int binaryToDecimal(int n) {
		int dec = 0;
		int i = 0;
		int bin;
		while (n != 0) {
			bin = n % 10;
			dec = dec + (bin * (int) Math.pow(2, i));
			n = n / 10;
			i++;
		}
		return dec;
	}

	/**
	 * Convert Binary Integer to Octal String
	 * @param n Integer n is passed in as Input
	 * @return Octal value is returned as output
	 */
	public static String binaryToOctal(int n) {
		int bin = 0;
		int dec = 0;
		String s = "";
		while (n != 0) {
			bin = n % 1000;
			dec = binaryToDecimal(bin);
			s = dec + s;
			n /= 1000;
		}
		return s;
	}

	/**
	 * Convert Binary Integer to Hexadecimal String
	 * @param n Integer n is passed in as Input
	 * @return String with Hexadecimal value is returned as output
	 */
	public static String binaryToHexadecimal(int n) {
		int bin = 0;
		int dec = 0;
		String s = "";

		while (n != 0) {
			bin = n % 10000;
			dec = binaryToDecimal(bin);
			if (dec == 10)
				s = "A" + s;
			else if (dec == 11)
				s = "B" + s;
			else if (dec == 12)
				s = "C" + s;
			else if (dec == 13)
				s = "D" + s;
			else if (dec == 14)
				s = "E" + s;
			else if (dec == 15)
				s = "F" + s;
			else
				s = dec + s;
			n /= 10000;
		}
		return s;
	}

	/**
	 * Check if the given number is a perfect Octal Number
	 * @param n Integer n is passed  in as Input
	 * @return Boolean value is returned as output
	 */
	public static boolean isOctal(int n) {
		int oct;
		while (n != 0) {
			oct = n % 10;
			if (oct > 7)
				return false;
			n = n / 10;
		}
		return true;

	}

	/**
	 * Convert Octal Integer to Binary String
	 * @param n Integer n is passed in as Input
	 * @return Binary value String is returned as output
	 */
	public static String octalToBinary(int n) {
		String rem = "";
		if (n == 0)
			rem = "000";
		while (n != 0) {
			rem = n % 2 + rem;
			n = n / 2;
		}
		if (rem.length() == 2)
			rem = "0" + rem;
		else if (rem.length() == 1)
			rem = "00" + rem;
		else
			rem = rem;
		return rem;
	}

	/**
	 * Convert Octal Integer to Decimal String
	 * @param n Integer n is passed in as Input
	 * @return Decimal value String is returned as output
	 */
	public static int octalToDecimal(int n) {
		int dec = 0;
		int i = 0;
		int oct;
		while (n != 0) {

			oct = n % 10;
			dec = dec + (oct * (int) Math.pow(8, i));
			n = n / 10;
			i++;

		}
		return dec;
	}

	/**
	 * Check if the given number is a perfect Hexadecimal Number
	 * @param s String s is passed  in as Input
	 * @return Boolean value is returned as output
	 */
	public static boolean isHexaDecimal(String s) {
		int j;
		char ch;
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			j = ch;
			if (Character.isDigit(ch)) {
				flag = true;
			} else if (j >= 65 && j <= 70) {
				flag = true;
			} else {
				flag = false;
				break;
			}

		}

		return flag;

	}

	/**
	 * Convert Hexadecimal Integer to Decimal String
	 * @param s String s is passed in as Input
	 * @return Decimal value String is returned as output
	 */
	public static int HexadecimalToDecimal(String s) {
		char ch;
		int j = 0;
		int k = 0;
		int hex = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			ch = s.charAt(i);
			j = ch;
			int above9;
			if (Character.isDigit(ch)) {
				j = ch - '0';
				hex = hex + (j * (int) Math.pow(16, k));
			} else if (j >= 65 && j <= 70) {
				if (j == 65)
					above9 = 10;
				else if (j == 66)
					above9 = 11;
				else if (j == 67)
					above9 = 12;
				else if (j == 68)
					above9 = 13;
				else if (j == 69)
					above9 = 14;
				else
					above9 = 15;
				hex = hex + (above9 * (int) Math.pow(16, k));
			}
			k++;
		}
		return hex;
	}

	/**
	 * Convert Hexadecimal Integer to Binary String
	 * @param n Integer n is passed in as Input
	 * @return Binary value String is returned as output
	 */
	public static String hexaToBinary(int n) {
		String rem = "";
		if (n == 0)
			rem = "000";
		while (n != 0) {
			rem = n % 2 + rem;
			n = n / 2;
		}
		if (rem.length() == 3)
			rem = "0" + rem;
		else if (rem.length() == 2)
			rem = "00" + rem;
		else if (rem.length() == 1)
			rem = "000" + rem;
		else
			rem = rem;
		return rem;
	}

	/**
	 * Convert Hexadecimal Characters(A-F) to Binary String
	 * @param c Character c is passed in as Input
	 * @return Binary value String is returned as output
	 */
	public static String alphaToBinary(char c) {
		String rem = "";
		if (c == 'A')
			rem = "1010" + "";
		else if (c == 'B')
			rem = "1011" + "";
		else if (c == 'C')
			rem = "1100" + "";
		else if (c == 'D')
			rem = "1101" + "";
		else if (c == 'E')
			rem = "1110" + "";
		else
			rem = "1111" + "";
		return rem;
	}

	/**
	 * Main Fuunction
	 * @param args  No command Line Arguments are passed
	 */
	public static void main(String[] args) {
		/**
		 * Sc as Scanner Object to get Input at the Runtime
		 */
		Scanner sc = new Scanner(System.in);
		/**
		 * Represents the choice that is to be choosen by user
		 */
		int choice;
		/**
		 * Represents the user input to continue conversion or to exit
		 */
		char option;
		/**
		 * The input given from the user....The actual number to be converted to other form.
		 */
		int number;
		/**
		 * Stores true  if the given number is of respective type else false
		 */
		boolean validityFlag;

		System.out.println("\t\t\t\t\t\t\tWelcome! \n\t\t\t\t\t\t   NUMBER SYSTEM CONVERTER");

		do {

			do {
				System.out.println("\t\t\t\t\tEnter 1 to convert decimal to binary\t   ");
				System.out.println("\t\t\t\t\tEnter 2 to convert decimal to octal\t   ");
				System.out.println("\t\t\t\t\tEnter 3 to convert decimal to hexadecimal ");
				System.out.println("\t\t\t\t\tEnter 4 to convert binary to decimal\t   ");
				System.out.println("\t\t\t\t\tEnter 5 to convert binary to octal\t   ");
				System.out.println("\t\t\t\t\tEnter 6 to convert binary to hexadecimal  ");
				System.out.println("\t\t\t\t\tEnter 7 to convert octal to binary\t   ");
				System.out.println("\t\t\t\t\tEnter 8 to convert octal to decimal\t   ");
				System.out.println("\t\t\t\t\tEnter 9 to convert octal to hexadecimal   ");
				System.out.println("\t\t\t\t\tEnter 10 to convert hexaecimal to binary  ");
				System.out.println("\t\t\t\t\tEnter 11 to convert hexadecimal to octal  ");
				System.out.println("\t\t\t\t\tEnter 12 to convert hexadecimal to decimal");
				System.out.print("\t\t\t\t\t ");
				System.out.println("\nPlease enter your choice");
				choice = sc.nextInt();
			} while (choice <= 0 || choice > 12);

			switch (choice) {

				case 1:
					System.out.println("Enter the decimal number for conversion from decimal to binary");
					number = sc.nextInt();
					System.out.println("The binary number " + number + " after conversion from decimal to binary is --> "
							+ decimalToBinary(number));
					break;
				case 2:
					System.out.println("Enter the decimal number for conversion from decimal to octal");
					number = sc.nextInt();
					System.out.println("The octal number " + number + " after conversion from decimal to octal is --> "
							+ decimalToOctal(number));
					break;
				case 3:
					System.out.println("Enter the decimal number for conversion from decimal to hexadecimal");
					number = sc.nextInt();
					System.out.println("The hexadecimal number " + number + " after conversion from decimal to hexadecimal is --> " + decimalToHexadecimal(number));
					break;
				case 4:
					do {
						System.out.println("Enter the binary number for conversion from binary to decimal");
						number = sc.nextInt();
						validityFlag = isBinary(number);
						if (validityFlag == false) {
							System.out.println("Please enter a valid binary number");
						}
					} while (validityFlag != true);
					System.out.println("The decimal number " + number + " after conversion from binary to decimal is --> " + binaryToDecimal(number));
					break;
				case 5:
					do {
						System.out.println("Enter the binary number for conversion from binary to octal");
						number = sc.nextInt();
						validityFlag = isBinary(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid binary number");
					} while (!(validityFlag));
					System.out.println("The octal number " + number + " after conversion from binary to octal is --> "+ binaryToOctal(number));
					break;
				case 6:
					do {
						System.out.println("Enter the binary number for conversion from binary to hexadecimal");
						number = sc.nextInt();
						validityFlag = isBinary(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid binary number");

					} while (!(validityFlag));
					System.out.println("The hexadecimal number " + number + " after conversion from binary to hexadecimal is --> " + binaryToOctal(number));
					break;
				case 7:
					do {
						System.out.println("Enter octal number for conversion from octal to binary ");
						number = sc.nextInt();
						validityFlag = isOctal(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid octal number");
					} while (!(validityFlag));
					String ans = "";
					int digit = 0;
					while (number != 0) {
						digit = number % 10;
						ans = octalToBinary(digit) + ans;
						number = number / 10;
					}
					System.out.println("The binary number " + number + " after conversion from octal to binary is --> " + ans);
					break;
				case 8:
					do {
						System.out.println("Enter the octal number for conversion from octal to decimal");
						number = sc.nextInt();
						validityFlag = isOctal(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid octal number");
					} while (!(validityFlag));
					System.out.println("The decimal number " + number + " after conversion from octal to decimal is --> " + octalToDecimal(number));
					break;
				case 9:
					do {
						System.out.println("Enter the octal number for conversion from Octal to Hexadecimal");
						number = sc.nextInt();
						validityFlag = isOctal(number);
						if (validityFlag == false)
							System.out.println("Please enter a valid octal number");
					} while (!(validityFlag));
					int octDeci = octalToDecimal(number);
					String deciHex = decimalToHexadecimal(octDeci);
					System.out.println("The hexadecimal number " + number + " after conversion from octal to hexadecimal is --> " + deciHex);
					break;
				case 10:
					String hexa;
					do {
						System.out.println("Enter the hexadecimal number for conversion from hexadecimal to binary");
						hexa = sc.nextLine();
						validityFlag = isHexaDecimal(hexa);
					} while (!validityFlag);
					String ans1 = "";
					for (int i = 0; i < hexa.length(); i++) {
						char ch = hexa.charAt(i);
						if (ch >= 65 && ch <= 70)
							ans1 += alphaToBinary(ch);
						else {
							int n10 = ch - '0';
							ans1 += hexaToBinary(n10);
						}
					}
					System.out.println("The binary number " + hexa + " after conversion from hexadecimal to binary is --> " + ans1);

					break;
				case 11:
					String hexa1;
					do {
						System.out.println("Enter the number for conversion from Hexadecimal to Octal");
						hexa1 = sc.nextLine();
						validityFlag = isHexaDecimal(hexa1);
					} while (!(validityFlag));
					int hexToDec = HexadecimalToDecimal(hexa1);
					String decToOct = decimalToOctal(hexToDec);
					System.out.println("The octal number " + hexa1 + " after conversion from hexadecimal to octal is --> "+ decToOct);
					break;
				case 12:
					String hexa2;
					do {
						System.out.println("Enter the hexadecimal number for conversion from hexadecimal to decimal");
						hexa2 = sc.nextLine();
						validityFlag = isHexaDecimal(hexa2);
					} while (!(validityFlag));
					int hexToDec1 = HexadecimalToDecimal(hexa2);
					String result = decimalToOctal(hexToDec1);
					System.out.println("The decimal number " + hexa2 + " after conversion from hexadecimal to decimal is --> " + result);
					break;

			}
			System.out.println("Do want to perform the conversion again?");
			boolean choose = true;
			do {
				System.out.println("Enter y to continue or n to exit");
				option = sc.next().toLowerCase().charAt(0);
				if (option == 'y')
					choose = false;
				else if (option == 'n')
					break;
				else
					choose = true;
			} while (choose);

		} while (option == 'y');
		if (option == 'n')
			System.out.println("Bye!!\nThank you for using the converter");
	}
}
