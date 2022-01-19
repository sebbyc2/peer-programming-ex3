package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Goldilocks {
	static List<Integer> weightList = new ArrayList<>(Arrays.asList(297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40,
			127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132));
	static List<Integer> tempList = new ArrayList<>(Arrays.asList(90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40,
			127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132));
	static List<Integer> lumList = new ArrayList<>(Arrays.asList(54, 78, 98, 12, 22, 12, 45, 65, 71, 87, 98, 45, 98, 10,
			100, 12, 54, 98, 87, 32, 65, 97, 64, 31, 54, 65, 87, 98, 65, 21));

	public static String goldilocks(int a, int b) {

		String returnString = "";

		for (int i = 0; i < weightList.size(); i++) {
			if (weightList.get(i) >= a && tempList.get(i) <= b) {
				returnString += (i + 1) + ", ";
			}

		}
		returnString = returnString.substring(0, returnString.length() - 2);
		return returnString;

	}

	public static String luminosity(int a, int b, int c) {

		String returnString = "";

		for (int i = 0; i < weightList.size(); i++) {
			if (weightList.get(i) >= a && tempList.get(i) <= b && lumList.get(i) >= c) {
				returnString += (i + 1) + ", ";
			}

		}
		returnString = returnString.substring(0, returnString.length() - 2);
		return returnString;
	}
}
