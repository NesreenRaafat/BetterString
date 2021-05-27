package test;

import java.util.function.BiPredicate;

public class string {


	public static String betterString(String x, String y, BiPredicate<String, String> t) {
		
		return t.test(x, y) ? x: y ;
}
}