import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Words
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.print("File name: ");
      String filename = new Scanner(System.in).nextLine();
      Scanner in = new Scanner(new File(filename));
      in.useDelimiter("[^A-Za-z?.'!]+");
      int words = 0;
      int sentences = 0;
      while (in.hasNext())
      {
         String next = in.next(); // A string of length 1
         words++;
         if (next.contains("?") || next.contains("!") )
         {
        	 sentences++;
         }
         if (next.contains("."))
         {
        	 
        	 if (!next.contains(".."))
        	 {
        		 sentences++;
        	 }
        	 if (next.contains("..."))
        	 {
        		 words++;
        	 }
         }
      }
      System.out.println("Words: " + words);
      System.out.println("Sentences: " + sentences);
   }
}
