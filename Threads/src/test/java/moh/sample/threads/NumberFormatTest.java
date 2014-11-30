package moh.sample.threads;

import org.junit.Test;

public class NumberFormatTest  {
	
	@Test
	public void testGetFormatted() {
		NumberFormat nf = new NumberFormat();
		
		double i=23.45;
		String p="####.##";
		String s = nf.getFormatted(i, p);
		org.junit.Assert.assertTrue( (s.equals("0023.45")));
	}

	@Test
	public void testGetFormatted1() {
		NumberFormat nf = new NumberFormat();
		
		double i=23.45;
		String p="####.##";
		String s = nf.getFormatted(i, p);
		org.junit.Assert.assertTrue( (s.equals("  23.45")));
	}

	@Test
	public void testGetFormatted2() {
		NumberFormat nf = new NumberFormat();
		
		double i=23.45;
		String p="####.##";
		String s = nf.getFormatted(i, p);
		org.junit.Assert.assertTrue( (s.equals("23.45")));
	}
	
}
