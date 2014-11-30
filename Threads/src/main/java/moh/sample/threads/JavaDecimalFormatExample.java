package moh.sample.threads;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaDecimalFormatExample {

	private static final String COMMA_SEPERATED = "###,###.###";
	private static final String TWO_DECIMAL_PLACES_WITH_COMMA = "###,###.00";
	private static final String FIXED_PLACES = "000,000.00";
	private static final String BEGIN_WITH_DOLLAR = "$###,###.00";

	private static double number = 12345.6;

	public static void main(String[] args) {

		DecimalFormat decimalFormat = new DecimalFormat(COMMA_SEPERATED);
		System.out.println(decimalFormat.format(number));

		applyCustomFormat(TWO_DECIMAL_PLACES_WITH_COMMA, number);
		applyCustomFormat(BEGIN_WITH_DOLLAR, number);
		applyCustomFormat(FIXED_PLACES, number);

		Locale UK_LOCALE = new Locale("en", "UK");
		Locale US_LOCALE = new Locale("en","US");
		applyCustomFormat(COMMA_SEPERATED, number, UK_LOCALE);
		applyCustomFormat(BEGIN_WITH_DOLLAR, number, US_LOCALE);
		
		//setting group
		DecimalFormat groupeddecimalFormat = new DecimalFormat("###,###.###");
		groupeddecimalFormat.setGroupingSize(6);
		System.out.println(groupeddecimalFormat.format(13243534.32));
		
	}

	private static void applyCustomFormat(String pattern, double value) {
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		decimalFormat.applyPattern(pattern);
		System.out.println(decimalFormat.format(value));
	}

	private static void applyCustomFormat(String pattern, double value, Locale locale) {
		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
		System.out.println(decimalFormat.format(value));

	}

}
