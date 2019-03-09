package com.ilearn.pit;

public class PITConverage {

	public boolean forLoopMutation(char[] charArray) {
		boolean result = false;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				result = true;

			}
		}
//
		char[] newCharArray = new char[charArray.length];
//		arrayCopy(charArray, newCharArray, -1);
////		char[] newCharArray1 = new char[charArray.length  + 1];
////		arrayCopy(charArray, newCharArray1, 0);
		
//		Utils.getProperty("TEST");

		SystemHelper.arraycopy(charArray, 0, newCharArray, 0, charArray.length);
		SystemHelper.getProperty("TEST");

		return result;

	}

//	private char[] arrayCopy(char[] source, char[] dest, Integer destStartLength) {
//		for (int i = 0; i < source.length; i++) {
//			int destStartIndex = destStartLength < 0 ? i:destStartLength ;
//			dest[destStartIndex] = source[i];
//		}
//		return dest;
//	}

	public boolean hasValue(String inputString) {
		if (inputString.length() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
