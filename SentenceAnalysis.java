
public class SentenceAnalysis {
	
	public static void main(String[] args){

	String sampleSentence = null;
	
	sampleSentence = "I can't go back to yesterday because I was a different person then.";
	System.out.println(countWhitespaces(sampleSentence));
	System.out.println(isNumeric(sampleSentence));
	}
	
	public static int countWhitespaces(String sentence)
	{
		int charCounter = 0;
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if (sentence.charAt(i) == ' ')
			{
				charCounter++;
			}
		}
		return charCounter;
	}
	
	public static boolean isNumeric(String sentence) 
	{
		boolean numeric = true;
		
		for(int j = 0; j < sentence.length(); j++)
		{
			if (sentence.charAt(j) > '9' || sentence.charAt(j) < '0')
			{
				numeric = false;
			}
		}
		return numeric;
	}
}
