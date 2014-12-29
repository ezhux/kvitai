package lt.kvitai.sodra.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumToWordsTests {

//	@Test
//	public void testNull() {
//		String words = SumToWords.sumToWords(null);
//		assertEquals("Nulis litų, 00 ct", words);
//	}
	
//	@Test
//	public void testZeros() {
//		String words = SumToWords.sumToWords(0.00);
//		assertEquals("Nulis litų, 00 ct", words);
//	}
//
//	@Test
//	public void testCents() {
//		String words = SumToWords.sumToWords(0.14);
//		assertEquals("Nulis litų, 14 ct", words);
//	}

	@Test
	public void testNull() {
		String words = SumToWords.prepareOutput(null);
		assertEquals("Nulis Eur, 00 ct", words);
	}
	
	@Test
	public void testBasic() {
		String words = SumToWords.prepareOutput("123.34");
		assertEquals("Vienas šimtas dvidešimt trys Eur, 34 ct", words);
	}

	@Test
	public void testBasic2() {
		String words = SumToWords.prepareOutput("12.34");
		assertEquals("Dvylika Eur, 34 ct", words);
	}
	
	@Test
	public void testBasic3() {
		String words = SumToWords.prepareOutput("112.34");
		assertEquals("Vienas šimtas dvylika Eur, 34 ct", words);
	}
	
	@Test
	public void testBasic4() {
		String words = SumToWords.prepareOutput("912.99");
		assertEquals("Devyni šimtai dvylika Eur, 99 ct", words);
	}
	
	@Test
	public void testBasic5() {
		String words = SumToWords.prepareOutput("1912.99");
		assertEquals("Vienas tūkstantis devyni šimtai dvylika Eur, 99 ct", words);
	}

	@Test
	public void testBasic6() {
		String words = SumToWords.prepareOutput("65.00");
		assertEquals("Šešiasdešimt penki Eur, 00 ct", words);
	}
	
	@Test
	public void testBasic7() {
		String words = SumToWords.prepareOutput("95.05");
		assertEquals("Devyniasdešimt penki Eur, 05 ct", words);
	}
	
	@Test
	public void testBasic8() {
		String words = SumToWords.prepareOutput("125.12");
		assertEquals("Vienas šimtas dvidešimt penki Eur, 12 ct", words);
	}
	
	@Test
	public void testBasic9() {
		String words = SumToWords.prepareOutput("100.00");
		assertEquals("Vienas šimtas Eur, 00 ct", words);
	}
	
	@Test
	public void testBasic10() {
		String words = SumToWords.prepareOutput("1000.00");
		assertEquals("Vienas tūkstantis Eur, 00 ct", words);
	}
	
	@Test
	public void testBasic11() {
		String words = SumToWords.prepareOutput("0.00");
		assertEquals("Nulis Eur, 00 ct", words);
	}	
	
	@Test
	public void testBasic12() {
		String words = SumToWords.prepareOutput("0.10");
		assertEquals("Nulis Eur, 10 ct", words);
	}	

	@Test
	public void testBasic13() {
		String words = SumToWords.prepareOutput("1405.89");
		assertEquals("Vienas tūkstantis keturi šimtai penki Eur, 89 ct", words);
	}	
	
	@Test
	public void testBasic14() {
		String words = SumToWords.prepareOutput("1105.89");
		assertEquals("Vienas tūkstantis vienas šimtas penki Eur, 89 ct", words);
	}	
	
	@Test
	public void testBasic15() {
		String words = SumToWords.prepareOutput("180.00");
		assertEquals("Vienas šimtas aštuoniasdešimt Eur, 00 ct", words);
	}	

	@Test
	public void testBasic16() {
		String words = SumToWords.prepareOutput("720.00");
		assertEquals("Septyni šimtai dvidešimt Eur, 00 ct", words);
	}	

	@Test
	public void testBasic17() {
		String words = SumToWords.prepareOutput("290.32");
		assertEquals("Du šimtai devyniasdešimt Eur, 32 ct", words);
	}	

	@Test
	public void testBasic18() {
		String words = SumToWords.prepareOutput("324.00");
		assertEquals("Trys šimtai dvidešimt keturi Eur, 00 ct", words);
	}	

	@Test
	public void testBasic19() {
		String words = SumToWords.prepareOutput("667.74");
		assertEquals("Šeši šimtai šešiasdešimt septyni Eur, 74 ct", words);
	}	
	
}
