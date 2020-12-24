package com.sdet.utils;

import java.util.Date;
import java.util.Random;

/**
 *   This class contains java specific libarraies , which include getSystemData , getRanNumber etc
 * @author Vikas
 *
 */

public class JavaUtils {

	/**
	 * used to get the random number range of 1 to 10000
	 * @return int
	 */
	public static int getRanDomData() {
		Random random = new Random();
		int  randomData = random.nextInt(10000);
		return randomData;
	}
	/**
	 * used the get the system current data with time
	 * @return int
	 */
	public static int getSystemDate() {
		Date date = new Date();
		return date.getDate();
	}
	
	

}
