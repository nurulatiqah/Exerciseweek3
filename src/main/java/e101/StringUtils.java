package e101;

public class StringUtils {
	
	/**
	 * @param word
	 * @param searched
	 * @return checks if the string searched is contained within the string word
	 */
	public static boolean included(String word, String searched){
		//The methods trim and toUpperCase() of the class String
		//inbuilt
		if(word.toUpperCase().contains(searched.toUpperCase().trim())){
			
			//if(word.contains(searched)){
			return true;
		}
		 return false;//if null
	 }
}
