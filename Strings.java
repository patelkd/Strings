public class Strings {
	public static void main(String[] args) {
		String str = new String("A string");
		String s = "A string";

		// if (str.equals(s)) {
		// 	System.out.println("A");
		// } else {
		// 	System.out.println("B");
		// }

		// for (int i=0; i<str.length(); i++) {
		// 	System.out.println(str.charAt(i));
		// }

		// for (int i =0; i<str.length-1; i++) {
		// 	System.out.println(str.substring(i,i+2));
		// }

		// if (contains ("baseball", "ball")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }


		// count("people", "e");
		// hasAnA("Array")

	// 	if (isAbcedarian("acknow")) {
	// 		System.out.println("yes");
	// 	} else {
	// 		System.out.println("no");
	// 	}
	// 

		// if (isDupledrome("llaammaa")) {
		// 	System.out.println("yes");
		// } else {
		// 	System.out.println("no");
		// }

	captainCrunch("hippos", 10);
}

	public static boolean isAbcedarian(String s) {
		int index = 0;
		char c = 'a';
		while (index <s.length()) {
			if (c> s.charAt(index)) {
				return false;
			}
			c = s.charAt(index);
			index = index + 1;
		}
		return true;
	}

	public static boolean isDupledrome(String s) {
		int length = s.length();

		if (length % 2 != 0) {
			return false;
		}
		int index = 0;
		while (index < length) {
			if (s.charAt(index) != s.charAt(index +1) ) {
				return false;
			}
			index = index + 2;
		}
		return true;
	}

	public static String captainCrunch (String s, int n) {
		String encoded = "";
		n = n%26;
		int index = 0;

		while (index < s.length()) {
			char current = s.charAt(index);
			if (current >= 'a' && current <= 'z') {
				int converted = current + n;
				if (converted > 'z') {
					converted = (converted - 'z') + 'a' -1;
				} else if (current < 'a') {
					converted = 'z' - ('a' - converted) + 1;
					}
				encoded = encoded + (char)converted; 
			} else if (current >= 'A' && current <= 'Z') {
				int converted = current + n;
				if (converted > 'Z') {
					converted = (converted - 'Z') + 'A' -1;
				} else if (current < 'A') {
					converted = 'Z' - ('A' - converted) + 1;
					}
				encoded = encoded + (char)converted;
			} else {
				encoded= encoded + (char)current;
			}
			index = index + 1;
		}
		System.out.println(encoded);
		return encoded;
	}

// 	public static int hasAnA(String s) {
// 		char a = ''
// 		for (int i=0; i<s.length; i++) {
// 			System.out.println(str.charAt(a));
// 		}
// 	}


// 	//returns number of instances of t inside of s
// 	public static int count(String s, String t) {
// 		for (int i=0; i <=s.length()-t.length()+1; i++) {
// 			if (s.substring(i, i+t.length()).equals(t) ) {
// 				sum +=1;
// 		}
// 	}

// 	public static boolean contains(String s, String t) {
// 		for (int i=0; i <=s.length()-t.length()+1; i++) {
// 			if (s.substring(i, i+t.length()).equals(t) ) {
// 				return true;
// 			}
// 		}

// 		return false;
// 	}
}