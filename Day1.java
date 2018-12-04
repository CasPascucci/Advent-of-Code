import chn.util.*;
import apcslib.*;
/**
 * Write a description of class Day1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Day1
{
    public static void main (String[] args)
    {
        FileInput inFile;
        int temp = 0;
        int total = 0;
        boolean check = false;
        
        inFile = new FileInput("Day1.txt");
        int[] dayOne= new int[1000000];
        int[] dayNeg= new int[1000000];
        while (!check)
        {
            if(!inFile.hasMoreTokens())
            {
                inFile.close();
                inFile  =new FileInput("Day1.txt");
            }
        while( inFile.hasMoreTokens())
        {
            
            total += inFile.readInt();
            
            
            if (total<0)
            {
              temp = total* -1;
              dayNeg[temp]++;
              
              if(dayNeg[temp] == 2)
            {
              System.out.println (" neg");
              check = true;
                break;
            }
                
            }
            else
            {
                dayOne[total]++;
                if(dayOne[total] == 2)
            {
                System.out.println (" pos");
                check = true;
                break;
            }
            }
            
            
        }
    }
        System.out.println(total);
        System.out.print(temp);
       
       
       
       
       
    }
}
