import chn.util.*;
/**
 * Write a description of class Day2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Day2Part1
{
    public static void main(String [] args)
    {
        FileInput inFile = new FileInput("Day2.txt");
        int[] freq = new int[27];
        String check;
        int two =0;
        int three =0;
        char ch;
        boolean dos = false;
        boolean tres = false; 
        int count= 0;
        while(inFile.hasMoreTokens())
        {
          check = inFile.readLine();
          count ++;
          for(int x=0; x<26;x++)
          {
              ch = check.charAt(x);
              freq[ch-96]++;
            
          }
          
          for(int x =0; x< 27; x++)
          {
              if(freq[x]==2)
            {
             dos= true;
             
                
            }
            if(freq[x] ==3)
            {
             tres = true;   
                
            }
           }
           
           if(dos)
           {
               two++;
               dos = false;
            }
            if(tres)
            {
                three++;
                tres = false;
            }
           
            for(int x =0; x< 27; x++)
            {
                freq[x] =0;
            }
        
        
        }
        
        System.out.println(two + " " + three);
        System.out.print(count);
        
        
        
        
        
        
    }
}
