
public class ChehckChar {
 public static void main(String args[]) {
	 String word="Wipro";
	 char ch = word.charAt(0);

   
     if (Character.isAlphabetic(ch)) {

         System.out.println(word + " is  ALPHABET.");

     } else if (Character.isDigit(ch)) {

         System.out.println(word + " is  DIGIT.");

     } else {

         System.out.println(word + " is  SPECIAL CHARACTER.");

     }

	 
 }
}