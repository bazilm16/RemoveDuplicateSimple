
public class RemoveDuplicateSimple {
	
	/**
	 * this converts a string that has duplicated characters and removes the duplicate 
	 * and if there are no duplicates it returns the original string as it is
	 * @return, the string without duplicates
	 */
	private static String makeUnique(String str){
		if(str == null || str.length() == 0) {
			return "";
		}
		String uniqueString = "";
		char letter;
		while(str.length() > 0){
			letter = str.charAt(0);
			//if the character exists in the string add it to the unique characters list
			if(uniqueString.indexOf(letter) == -1){
				uniqueString += letter;
			}
			//we convert the letter into a string so that we replace it in the string
			//we then remove the character from the string
			str = str.replaceAll(letter + "", "");
		}
		return uniqueString;
	}//makeUnique

	public static void main(String[] args) {
		String word = "babababa";
		System.out.println(makeUnique(word));

	}

}
