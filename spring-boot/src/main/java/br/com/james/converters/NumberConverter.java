package br.com.james.converters;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		if (isNumeric(strNumber)) {
			return Double.parseDouble(strNumber);
		} else
			return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		return strNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

}
