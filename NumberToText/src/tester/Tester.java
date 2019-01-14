package tester;

import java.text.NumberFormat;
import java.util.Scanner;


import converter.Converter;
public class Tester {
	
	//For the general trying from the console
		public static String makeChoice(){
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Please enter 1 for Text To Number, 2 for Number to Text, Q for Other test Scenarios:");
			String inputChoice = reader.nextLine();
			boolean containsNumber;
			if(!"1".equals(inputChoice.trim()) && !"2".equals(inputChoice.trim())){
				if("q".equals(inputChoice.trim().toLowerCase())){
					inputChoice = "q";
				}else{
					inputChoice = makeChoice();
				}
					
			}else{
				if("1".equals(inputChoice)){
					System.out.println("Enter your number with words for Text-to-Number:");
					inputChoice = "1"+reader.nextLine();
					containsNumber = inputChoice.substring(1).trim().matches(".*\\d+.*");
					if(containsNumber){
						System.out.println("Only Words!!!!");
						inputChoice = makeChoice();
					}
					
				}else{
					System.out.println("Enter your number for Number-to-Text:");
					inputChoice = "2"+reader.nextLine();
					try
				    {
				        long numTemp = Long.parseLong(inputChoice.substring(1).trim());
				        containsNumber = true;
				    }
				    catch(NumberFormatException e)
				    {
				    	containsNumber = false;
				    	System.out.println("Only Numbers!!!!");
				    	inputChoice = makeChoice();
				    	
				    }
					
				}
			}
			//reader.close();
			return inputChoice;
		
			
			
		}
		
		public static void main(String[] args) {
			String inputChoice = null;
			//general trying from console*****************
			do {
				inputChoice = makeChoice();
				if("1".equals(inputChoice.substring(0, 1)) && !"q".equals(inputChoice.substring(0, 1))){
					System.out.println("TextToNumber :" + inputChoice.substring(1).trim() +" :" + Converter.TextToNumberConverter(inputChoice.substring(1).trim()));
				}else if("2".equals(inputChoice.substring(0, 1)) && !"q".equals(inputChoice.substring(0, 1))){
					System.out.println("NumberToText :" + inputChoice.substring(1).trim() +" :" + Converter.NumberToTextConverter(Long.parseLong(inputChoice.substring(1).trim())));
				}
			} while(!"q".equals(inputChoice.toLowerCase().trim()));
			//*********************************************
			long n;
			int i;
			double d = 234.45;
			float f = 344.054f;
			String strTemp = null;
			
			System.out.println("*****NUMBER TO TEXT*****"+"\n");
			System.out.println("NUMBER TO TEXT - INPUT TYPE DOUBLE***" + d + " = '" + Converter.NumberToTextGeneric(d) + "'"+"\n");
			
			strTemp ="123456";
			System.out.println("NUMBER TO TEXT - INPUT TYPE STRING***" + strTemp + " = '" + Converter.NumberToTextGeneric(strTemp) + "'"+"\n");
			
			strTemp ="12a34ss";
			System.out.println("NUMBER TO TEXT - INPUT TYPE WRONG STRING***" + strTemp + " = '" + Converter.NumberToTextGeneric(strTemp) + "'"+"\n");
			
			i=-123;
			System.out.println("NUMBER TO TEXT - INPUT TYPE NEGATIVE INTEGER: "+ i + "=" + Converter.NumberToTextConverter(i) + "'" +"\n");
			
			
			i=12345;
			System.out.println("NUMBER TO TEXT - INPUT TYPE INTEGER: "+ i + "=" + Converter.NumberToTextConverter(i) + "'"+"\n");
			
			
			i=256789;
			System.out.println("NUMBER TO TEXT - INPUT TYPE INTEGER: "+ i + "=" + Converter.NumberToTextConverter(i) + "'" + "\n");
			
			
			
			n = 7L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+n + "='" + Converter.NumberToTextConverter(n) + "'" + "\n");
			

			n = 17L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+n + "='" + Converter.NumberToTextConverter(n) + "'" + "\n");

			n = 56L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ n + "='" + Converter.NumberToTextConverter(n) + "'" + "\n");

			n = 178L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ n + "='" + Converter.NumberToTextConverter(n) + "'" + "\n");

			n = 456L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ n + "='" + Converter.NumberToTextConverter(n) + "'" + "\n");

			n = 1329L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ n + " = '" + Converter.NumberToTextConverter(n) + "'" + "\n");

			n = 23876L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ n + " = '" + Converter.NumberToTextConverter(n) + "'" + "\n");

			n = 169052L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ n + " = '" + Converter.NumberToTextConverter(n) + "'" + "\n");
			
			//million
			n = 11005010L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ "MILLION***" + n + " = '" + Converter.NumberToTextConverter(n) + "'" + "\n");
			
			//billion
			n = 2125695225L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ "BILLION***"+ n + " = '" + Converter.NumberToTextConverter(n) + "'" + "\n");
			
			//trillion
			n = 1100501057123L;
			System.out.println("NUMBER TO TEXT - INPUT TYPE LONG: "+ "TRILLION***" + n + " = '" + Converter.NumberToTextConverter(n) + "'" + "\n");
			
			System.out.println("*****TEXT TO NUMBER*****"+"\n");
			strTemp = "two Hundred and Thirty four";
			System.out.println("TEXT TO NUMBER***" + strTemp + " = '" + Converter.TextToNumberConverter(strTemp) + "'"+"\n");
			
			System.out.println("TEXT TO NUMBER - INPUT TYPE DOUBLE***" + d + " = '" + Converter.TextToNumberConverter(d) + "'"+"\n");
			
			System.out.println("TEXT TO NUMBER - INPUT TYPE LONG***" + n + " = '" + Converter.TextToNumberConverter(n) + "'"+"\n");
			
			System.out.println("TEXT TO NUMBER - INPUT TYPE INT***" + i + " = '" + Converter.TextToNumberConverter(i) + "'"+"\n");
			
			strTemp = "one million, seventy-three thousand and four hundred and sixty-eight";
			System.out.println("TEXT TO NUMBER - MILLION***" + strTemp + " = '" + Converter.TextToNumberConverter(strTemp) + "'"+"\n");
			
			strTemp = "four hundred and twelve billion, nine hundred and ten million, seven hundred and thirty-four thousand and six hundred and eighty-nine";

			System.out.println("TEXT TO NUMBER - BILLION***" + strTemp + " = '" + Converter.TextToNumberConverter(strTemp) + "'"+"\n");
			
			strTemp = "two hundred and thirty-four trillion, four hundred and twelve billion, nine hundred and ten million, seven hundred and thirty-four thousand and six hundred and eighty-nine";
			System.out.println("TEXT TO NUMBER - TRILLION***" + strTemp + " = '" + Converter.TextToNumberConverter(strTemp) + "'"+"\n");
			
			strTemp = "One hundred two thousand and thirty four";
			System.out.println("TextToNumber-- " + "Number: "+strTemp + ": "+ Converter.TextToNumberConverter(strTemp) + "\n");
			
			
		
			
		}

}
