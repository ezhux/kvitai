package lt.kvitai.sodra.util;

public class SumToWords {
	
	public static String prepareOutput(String sum){
		if (sum == null){
			return "Nulis Eur, 00 ct";
		}
		Double sumInt = Math.floor(Double.parseDouble(sum));
		String cents = sum.substring(sum.lastIndexOf(".") + 1);
		String out = sumToWords(sumInt);
		out = out + "Eur, " + cents + " ct";
		return out.substring(0,1).toUpperCase() + out.substring(1);
	}
	
	private static String sumToWords(Double sumInt){
		
		String[] onesWords = { "nulis ", "vienas ", "du ", "trys ", "keturi ", "penki ", "šeši ", "septyni ", "aštuoni ", "devyni ", "dešimt ", "vienuolika ", "dvylika ", "trylika ", "keturiolika ", "penkiolika ", "šešiolika ", "septyniolika ", "aštuoniolika ", "devyniolika " };
		String[] tensWords = {"", "", "dvidešimt ", "trisdešimt ", "keturiasdešimt ", "penkiasdešimt ", "šešiasdešimt ", "septyniasdešimt ", "aštuoniasdešimt ", "devyniasdešimt "};
		
		StringBuilder wordsLt = new StringBuilder("");
	
		if (sumInt == 0){
			wordsLt.append("Nulis ");
		}
		
		Double thousands = Math.floor(sumInt / 1000);
		sumInt = sumInt - thousands * 1000;
		Double hundreds = Math.floor(sumInt / 100);
		sumInt = sumInt - hundreds * 100;
		Double tens = Math.floor(sumInt / 10);
		Double num = sumInt % 10;
		
		if (thousands > 0){
			if (thousands == 1){
				wordsLt.append("vienas tūkstantis ");
			}
			else {
				wordsLt.append(sumToWords(thousands));
				if (thousands % 10 == 0 ){
					wordsLt.append("tūkstančių ");
				} else if ((thousands * 10) % 10 == 1 ) {
					wordsLt.append("tūkstantis ");
				} else {
					wordsLt.append("tūkstančiai ");
				}
			}
		}
		
		if (hundreds > 0){
			if (hundreds == 1){
				wordsLt.append("vienas šimtas ");
			} else {
				wordsLt.append(sumToWords(hundreds) + "šimtai ");
			}
		}
		
		if (tens > 0 || num > 0){
//			if (wordsLt.length() > 0){
//				wordsLt.append(" ");
//			}
			if(tens < 2){
				wordsLt.append(onesWords[tens.intValue() * 10 + num.intValue()]);
			}
			else {
				wordsLt.append(tensWords[tens.intValue()]);
				if (num > 0){
					wordsLt.append(onesWords[num.intValue()]);
				}
			}
			
		}
		
		
		
		String out = wordsLt.toString();
//		out = out.trim();
		
		return out;
	}
	

}
