package _02_gotta_catchem_all;

public class ExceptionMethods {
public static double divide(double d1, double d2) 	throws IllegalArgumentException {
	if (d2==0.0)
		throw new IllegalArgumentException();
	return d1/d2;
}
public static String reverseString(String str) throws IllegalStateException {
if (str.equals(""))
throw new IllegalStateException();
String s = "";
for (char c:str.toCharArray()) {
	s+=c;
}

return s;
}

}

