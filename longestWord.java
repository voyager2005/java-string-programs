// This code was contributed by https://github.com/voyager2005

import java.util.Scanner ; 
public class program_05
{
    public static void main(String args[])
    {
        //calling Scanner class
        Scanner sc= new Scanner(System.in);
        
        //prompting and accepting valu from the user 
        System.out.println("Please enter a String : " );
        String s = sc.nextLine().trim();
        
        //apending Space at the and of string s
        s = s + " " ;
        
        //declaration ad initialisation 
        String longestWord = ""; 
        String word = "" ; 
        //loop to display the longest word and the number of characters in the given String 
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            
            //checking if the character is not a space
            if(ch != ' ')
            {
                word = word + ch;  
            }
            else
            {
                if((word.length())>(longestWord.length()))
                {
                    longestWord = word ; 
                }
                word = "" ; 
            }
        }
        
        //display Statement 
        System.out.println("The longest word is : "+ longestWord + " and is : "
            +longestWord.length()+" characters long.");
    }
}
