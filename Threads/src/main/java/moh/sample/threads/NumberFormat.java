package moh.sample.threads;

import java.text.DecimalFormat;

public class NumberFormat {

	public String getFormatted(double d, String pat){
		DecimalFormat df = new DecimalFormat(pat);
		return df.format(d) ;
	}
}
