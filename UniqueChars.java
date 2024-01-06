/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {

       String newStr = String.valueOf(str.charAt(0));

        for (int i = 1; i < str.length(); i ++){

            char currentChar = str.charAt(i);

            if (currentChar == ' ' || (newStr.indexOf(currentChar) == -1)){
                newStr += currentChar;
            }
        }

        return newStr;
    }
}
