package io.zipcoder;


import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int sum = 0;
        String[] newInput = input.split(" ");
        for (int i = 0; i < newInput.length; i++) {
            if (newInput[i].endsWith("y") || newInput[i].endsWith("z")) {
                sum += 1;
            }
        }

        return sum;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        String newBase = base.replace(remove, "");
        return newBase;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        int sumIs = StringUtils.countMatches(input, "is");
        int sumNot = StringUtils.countMatches(input, "not");
        /*for(int i=0;i<newInput.length;i++){
            if(newInput[i].matches("is")){
                sumIs++;
                System.out.println(sumIs);
            }
            else {newInput[i].matches("not");
                sumNot++;}

            System.out.println(sumNot);
        }
*/
        if (sumIs == sumNot) {
            return true;
        }
        return false;
    }


    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char g1 = 'g';

        char[] toChar = input.toCharArray();
        int g2 = ArrayUtils.indexOf(toChar, g1);
        for (int i = 0; i < toChar.length; i++) {

            if (toChar[i] == g1 && toChar[i + 1] == g1) {

                return true;
            }
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count =0;
        char[] toChar = input.toCharArray();

        for (int i = 0; i < toChar.length-2; i++) {

            if (toChar[i] == toChar[i + 1] && toChar[i] == toChar[i + 2]) {
                count += 1;
            }

        }
        return count;
    }
}
