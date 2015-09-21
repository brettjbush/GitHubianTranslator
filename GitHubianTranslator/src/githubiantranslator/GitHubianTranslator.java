
package githubiantranslator;

import java.awt.Toolkit;
import java.util.Scanner;

/**
 * GitHubian Translator
 * 
 * A simple Java application to teach basic GitHub concepts
 * 
 * @author Brett Bush
 * @contributors GitHub Users
 * @date 09-20-15
 */
public class GitHubianTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Hello and welcome to the GitHubian Translator!");
        
        // Get user input
        System.out.println("Enter a statement to translate (or 'q' to quit):");
        System.out.print("Translator> ");
        String input = kb.nextLine();
        
        // While user has not entered "q"
        while(!input.equals("q"))
        {
            String translation = toGitHubian(input);
            
            System.out.println("GitHubian: " + translation);
            System.out.println();
            
            // Get user input
            System.out.println("Enter a statement to translate (or 'q' to quit):");
            System.out.print("Translator> ");
            input = kb.nextLine();
        }
        
    }
    
    /**
     * Translates a string to GitHubian
     * @param input  the string to be translated
     * @return  the input string in GitHubian
     */
    public static String toGitHubian(String input)
    {
        String translation = input;
        
        translation = toLowerCase(translation);
        translation = replaceIt(translation);
        translation = replacePunctuation(translation);
        translation = replaceLetters(translation);
        
        return translation;
    }
    
    /**
     * Step 1) Creates all lowercase version of input string
     * @param input   the string to be translated
     * @return  all lowercase version of input string
     */
    public static String toLowerCase(String input)
    {
        String translation = input;

        // TODO make translation all lower case
        
        /** CODE BLOCK 1 **/
        
        return translation;
    }
    
    /**
     * Step 2) Replace all instances of the word 'it' with 'git'
     * @param input  the string to be translated
     * @return  string with all instances of the word 'it' replaced with 'git'
     */
    public static String replaceIt(String input)
    {
        StringBuilder translation;
        translation = new StringBuilder();
        
        Scanner tokenizer = new Scanner(input);
        
        tokenizer.forEachRemaining(token ->
        {
            // If "it" is its own word (or next to a series of punctuation)
            if(token.matches("(\\b|\\p{Punct}+)it(\\b|\\p{Punct}+)"))
            {
                token = token.replace("it", "git");
            }

            translation.append(token);
            
            if(tokenizer.hasNext())
            {
                translation.append(" ");
            }    
        });
                    
        return translation.toString();
    }
    
    /**
     * Step 3) Replace all '.' with '!'
     * @param input  the string to be translated
     * @return  string with '.' replaced by '!'
     */
    public static String replacePunctuation(String input)
    {
        String translation = input;
        
        // TODO replace all '.' with '!'
        // HINT when using a certain String method, "." is represented
        // as "\\." due to regular expressions
        
        /** CODE BLOCK 2 **/
        
        return translation;
    }
    
    /**
     * Step 4) Replace certain letters to fully translate to GitHubian
     * @param input  the string to be translated
     * @return  string fully translated into GitHubian
     */
    public static String replaceLetters(String input)
    {
        String translation = input;
        
        // TODO replace the following vowels accordingly
        // a => 4
        // e => 3
        // i => 1
        // o => 0
        
        /** CODE BLOCK 3 - 6 **/
        
        // TODO replace the following consonants accordingly
        // s => 5
        // t => 7
        // z => 2
        
        /** CODE BLOCK 7 - 9 **/
        
        return translation;
    }
}
