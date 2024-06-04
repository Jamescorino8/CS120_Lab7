
import java.util.ArrayList;

/**
 * This program can be used to test the ShoppingList class.
 * 
 * @author Prof. White
 * @version Spring 2021
 */
public class ShoppingListDriver
{
    public static void main(String[] args)
    {
        int score = 0;
        int maxScore = 0;

        ShoppingList myList = new ShoppingList();
        ArrayList<String> theList = myList.getList();
        if(theList != null && theList.size() == 0) score++;
        maxScore += 1;
      
        theList = new ArrayList<String>();
        theList.add("milk");
        theList.add("bread");
        theList.add("eggs");
        myList.setList(theList);
        if(myList != null && myList.numItems() == 3) score++;
        if(myList.toString().equals("[milk, bread, eggs]")) score++;
        maxScore += 2;
      
        String returnValue = myList.addItem("cheese");
        if(returnValue.contains("cheese has been added.")) score++;
        returnValue = myList.addItem("milk");
        if(returnValue.contains("milk is already")) score++;
        returnValue = myList.addItem("bread");
        if(returnValue.contains("bread is already")) score++;
        returnValue = myList.addItem("eggs");
        if(returnValue.contains("eggs is already")) score++;
        returnValue = myList.addItem("cheese");
        if(returnValue.contains("cheese is already")) score++;
        returnValue = myList.addItem("ice cream");
        if(returnValue.contains("ice cream has been added.")) score++;
        if(myList.numItems() == 5) score++;
        maxScore += 7;
      
        returnValue = myList.removeItem("milk");
        if(returnValue.contains("milk has been removed.")) score++;
        returnValue = myList.removeItem("ice cream");
        if(returnValue.contains("ice cream has been removed.")) score++;
        returnValue = myList.removeItem("eggs");
        if(returnValue.contains("eggs has been removed.")) score++;
        returnValue = myList.removeItem("soda");
        if(returnValue.contains("soda is not found")) score++;
        if(myList.numItems() == 2) score++;
        maxScore += 5;
        
        myList.clearList();
        if(myList.numItems() == 0) score++;
        if(myList.toString().equals("[]")) score++;
        maxScore += 2;
        
        if(score == maxScore)
        {
            System.out.println("Congratulations!  You have passed all the tests!");
        } else {
            System.out.println("You scored " + score + " points out of " + maxScore + " points.");
            System.out.println("You still have a little more work to do.  You can do it!");
        }
    }
}
