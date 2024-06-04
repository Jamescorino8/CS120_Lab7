import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 * In this program, the user must enter six unique values in [1, 49].  
 * Then, these numbers are compared to the six randomly generated winning 
 * numbers.  The number of matches is printed.
 * 
 * @author nicholas Gati
 * @version  3/15/22
 */
public class Pick6
{

    /**
     * Run the main method to start the program.
     * 
     * @param args No command line arguments necessary.
     */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pickedNumbers = new ArrayList<Integer>();

        do {
            System.out.print("Enter a number in [1, 49]:  ");
            int num = sc.nextInt();
            if (num < 49 && num > 1) {
              if (!pickedNumbers.contains(num)){
                pickedNumbers.add(num);
                }
              else{
                System.out.println("ERROR: " + num + " already picked.  \n");
              }
            }
           else{
             System.out.println("ERROR: Number must be in [1,49].  \n");
           }
          
        } while(pickedNumbers.size() < 6);

        printOutput(pickedNumbers, pickWinningNumbers());  
      
    }

    /**
     * Returns the six winning lottery numbers.  These numbers are
     * in the range [1, 49] and are each unique.
     * 
     * @return The six winning lottery numbers.  These numbers are
     * in the range [1, 49] and are each unique.
     */
    private static ArrayList<Integer>pickWinningNumbers()
    {
        ArrayList<Integer> winners = new ArrayList<Integer>();
        Random rand = new Random();
        int num = rand.nextInt(48) + 1;

        while(winners.size() < 6) {
            winners.add(num);
            num = rand.nextInt(48) + 1;
        }

        return winners;
    }

    /**
     * Returns the number of times a value in the input userPicks list matches
     * a value in the input winningNums list.
     * 
     * @param userPicks The list of numbers picked by the user.
     * @param winningNumbers The list of winning numbers.
     * @return The number of times a value in the input userPicks list matches
     * a value in the input winningNums list.
     */
    private static int countCorrect(ArrayList<Integer> userPicks, ArrayList<Integer> winningNums)
    {
      int same = 0;
      //int pickNum = 0;
      //int winnerNum = 0;

      for (int i = 0; i < 6; i++) {
        if (winningNums.contains(userPicks.get(i))) {
          same++;
        }
      }
      
      return same;
    }

    /**
     * Prints the numbers the user picked, the winning numbers, and the number of
     * matches.
     * 
     * @param userPicks The list of numbers picked by the user.
     * @param winningNumbers The list of winning numbers.
     */
    private static void printOutput(ArrayList<Integer> userPicks, ArrayList<Integer> winningNums)
    {
        String userPicks2 = "";
        String winningNums2 = "";
      for(Integer i: userPicks){
        userPicks2 += i + " ";
      }

      for(Integer i: winningNums){
        winningNums2 += i + " ";
      }
      
        System.out.print("\nYou picked:  " + userPicks2);
      
        System.out.print("\n\nThe winning numbers are:  " + winningNums2);
        
        System.out.println("\n\nYou got " + countCorrect(userPicks, winningNums) + " correct.");
    }
}
