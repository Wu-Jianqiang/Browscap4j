package in.ankushs.browscap4j.utils;

import java.io.File;

import in.ankushs.browscap4j.domain.Browscap;
/**
 * 
 * String utilities.
 * @author Ankush Sharma
 */
public class Strings {
	
	private Strings(){}
	
	/**
	 * Checks whether a String has any  text in it.
	 * @param str the string being inspected for text
	 * @return false if {@code str} is null or empty(after trimming),and true otherwise
	 */
	public static boolean hasText(final String str){
		if(str==null){
			return false;
		}
		return str.trim().length()>0;
	}
	
}
