package converter;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Converter {
	public static final long oneBillion = 1000000000L;
	public static final long oneMillion = 1000000L;
	public static final long oneTrillion = 1000000000000L;
	public static final long billionMaxLimit = 1000000000000L;
	public static final long millionMaxLimit = 1000000000L;
	public static final long trillionMaxLimit = 1000000000000000L;
	/*public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };*/
	//TexttoNumber'da yazilan kelimler doðru mu diye units Listesi kullaniliyor.
	//NumberToText için de units Listesi kullaniliyor. 
	//Fakat sadece nineteen elemanina kadarlik bölumune ihtyac duyuluyor.
	//Normalde yukaridaki comment edilen String array'i kullanmistim NumbertoText icin
	//Ýki tane yer aalinmasin diye hem TextToNumber hem deNumberToText islemlerimi asagidaki List uzerinden hallettim
	public static final List<String> textOfNumbers = Arrays.asList( "","one","two","three","four","five","six","seven",
		    "eight","nine","ten","eleven","twelve","thirteen","fourteen",
		    "fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
		    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
		    "hundred","thousand","million","billion","trillion" );
	//NumberToText onluk bolumler icin tenParts kulaniliyor.
	public static final String[] tenParts = { 
			"", 		// 0
			"",		// 1
			"Twenty", 	// 2
			"Thirty", 	// 3
			"Forty", 	// 4
			"Fifty", 	// 5
			"Sixty", 	// 6
			"Seventy",	// 7
			"Eighty", 	// 8
			"Ninety" 	// 9
	};
	public static < T > String NumberToTextGeneric(T input){
		String outputStr = null;
		if(input.getClass().getName().toLowerCase().contains("double")){
			StringTokenizer token = new StringTokenizer(String.valueOf(input), ".");
			String first = token.nextToken();
			String second = token.nextToken();
			outputStr = NumberToTextConverter(Long.parseLong(first)) + " POINT "+ NumberToTextConverter(Long.parseLong(second));
		}else if(input.getClass().getName().toLowerCase().contains("double")){
			outputStr = "You Have to Enter Numeric Value for The Number to Text Conversion";
		}else if(input.getClass().getName().toLowerCase().contains("integer") || input.getClass().getName().toLowerCase().contains("long")){
			long n = Long.parseLong(String.valueOf(input));
			outputStr = NumberToTextConverter(n);
		}else if(input.getClass().getName().toLowerCase().contains("string")){
			try
		    {
		        long numTemp = Long.parseLong(String.valueOf(input));
		        outputStr = NumberToTextConverter(numTemp);
		    }
		    catch(NumberFormatException e)
		    {
		    	outputStr = "You Have to Enter Numeric String for The Number to Text Conversion";
		    }
		}else{
			outputStr = "This type of input is not supported for The Number to Text Conversion";
		}
		
		return outputStr;
	}
	public static < T > long TextToNumberConverter(T genericInput){
		String input = String.valueOf(genericInput);
		boolean isValidInput = true;
	    long result = 0;
	    long finalResult = 0;
	    
	    if(input != null && input.length()> 0)
	    {
	        input = input.replaceAll("-", " ");
	        input = input.replaceAll(",", "");
	        //input = input.replaceAll(".", "");
	        input = input.toLowerCase().replaceAll(" and", " ");
	        String[] splittedParts = input.trim().split("\\s+");

	        for(String str : splittedParts)
	        {
	            if(!textOfNumbers.contains(str))
	            {
	                isValidInput = false;
	                System.out.println("Invalid word found : "+str);
	                break;
	            }
	        }
	        if(isValidInput)
	        {
	            for(String str : splittedParts)
	            {
	                if(str.equalsIgnoreCase("zero")) {
	                    result += 0;
	                }
	                else if(str.equalsIgnoreCase("one")) {
	                    result += 1;
	                }
	                else if(str.equalsIgnoreCase("two")) {
	                    result += 2;
	                }
	                else if(str.equalsIgnoreCase("three")) {
	                    result += 3;
	                }
	                else if(str.equalsIgnoreCase("four")) {
	                    result += 4;
	                }
	                else if(str.equalsIgnoreCase("five")) {
	                    result += 5;
	                }
	                else if(str.equalsIgnoreCase("six")) {
	                    result += 6;
	                }
	                else if(str.equalsIgnoreCase("seven")) {
	                    result += 7;
	                }
	                else if(str.equalsIgnoreCase("eight")) {
	                    result += 8;
	                }
	                else if(str.equalsIgnoreCase("nine")) {
	                    result += 9;
	                }
	                else if(str.equalsIgnoreCase("ten")) {
	                    result += 10;
	                }
	                else if(str.equalsIgnoreCase("eleven")) {
	                    result += 11;
	                }
	                else if(str.equalsIgnoreCase("twelve")) {
	                    result += 12;
	                }
	                else if(str.equalsIgnoreCase("thirteen")) {
	                    result += 13;
	                }
	                else if(str.equalsIgnoreCase("fourteen")) {
	                    result += 14;
	                }
	                else if(str.equalsIgnoreCase("fifteen")) {
	                    result += 15;
	                }
	                else if(str.equalsIgnoreCase("sixteen")) {
	                    result += 16;
	                }
	                else if(str.equalsIgnoreCase("seventeen")) {
	                    result += 17;
	                }
	                else if(str.equalsIgnoreCase("eighteen")) {
	                    result += 18;
	                }
	                else if(str.equalsIgnoreCase("nineteen")) {
	                    result += 19;
	                }
	                else if(str.equalsIgnoreCase("twenty")) {
	                    result += 20;
	                }
	                else if(str.equalsIgnoreCase("thirty")) {
	                    result += 30;
	                }
	                else if(str.equalsIgnoreCase("forty")) {
	                    result += 40;
	                }
	                else if(str.equalsIgnoreCase("fifty")) {
	                    result += 50;
	                }
	                else if(str.equalsIgnoreCase("sixty")) {
	                    result += 60;
	                }
	                else if(str.equalsIgnoreCase("seventy")) {
	                    result += 70;
	                }
	                else if(str.equalsIgnoreCase("eighty")) {
	                    result += 80;
	                }
	                else if(str.equalsIgnoreCase("ninety")) {
	                    result += 90;
	                }
	                else if(str.equalsIgnoreCase("hundred")) {
	                    result *= 100;
	                }
	                else if(str.equalsIgnoreCase("thousand")) {
	                    result *= 1000;
	                    finalResult += result;
	                    result=0;
	                }
	                else if(str.equalsIgnoreCase("million")) {
	                    result *= 1000000;
	                    finalResult += result;
	                    result=0;
	                }
	                else if(str.equalsIgnoreCase("billion")) {
	                    result *= 1000000000;
	                    finalResult += result;
	                    result=0;
	                }
	                else if(str.equalsIgnoreCase("trillion")) {
	                    result *= 1000000000000L;
	                    finalResult += result;
	                    result=0;
	                }
	            }

	            finalResult += result;
	            result=0;
	            
	        }
	    }
	    return finalResult;
	}
	
	public static String NumberToTextConverter(final long n){

		if (n < 0) {
			return "Minus " + NumberToTextConverter(-n);
		}

		else if (n < 20) {
			
			return textOfNumbers.get((int) n);
		}

		else if (n < 100) {
			return tenParts[(int) (n / 10)] + ((n % 10 != 0) ? " " : "") + textOfNumbers.get((int) (n % 10));
		}

		else if (n < 1000) {
			return textOfNumbers.get((int) (n / 100)) + " Hundred " + ((n % 100 != 0) ? "and " : "") + NumberToTextConverter(n % 100);
		}

		else if (n < 1000000) {
			return NumberToTextConverter(n / 1000) + " Thousand " + ((n % 10000 != 0) ? "and " : "")+ NumberToTextConverter(n % 1000);
		}

		else if (n < millionMaxLimit) {
			return NumberToTextConverter(n / oneMillion) + " Million," + ((n % oneMillion != 0) ? " " : "") + NumberToTextConverter(n % 1000000);
		}
		else if (n < billionMaxLimit) {
			return NumberToTextConverter(n / oneBillion) + " Billion," + ((n % oneBillion != 0) ? " " : "") +NumberToTextConverter(n % oneBillion);
		}
		else if (n < trillionMaxLimit){
			return NumberToTextConverter(n / oneTrillion) + "Trillion," + ((n % oneTrillion != 0) ? " " : "") + NumberToTextConverter(n % oneTrillion);
		}else{
			return "Over Trillion Limit";
		}
	}
	
	
	
}