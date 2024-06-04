import java.util.ArrayList;

/**
 * This class represents a shopping list.
 * 
 * @author nicholas Gati JAMES CORINO
 * @version 3/15/22
 */
public class ShoppingList
{
    private ArrayList<String> list;

    /**
     * Constructs a new shopping list that does not contain any items.
     */
    public ShoppingList()
    {
        list = new ArrayList<String>();
    }

    /**
     * Returns the shopping list.
     * 
     * @return The shopping list.
     */
    public ArrayList<String> getList()
    {
        return list;
    }

    /**
     * Sets the shopping list to the input list.  Any items previously
     * in the shopping list will be lost.
     * 
     * @param newList The new shopping list.
     */
    public void setList(ArrayList<String> newList)
    {
      list = newList;  //error on this line; flipped from newList = list
    }

    /** 
     * Adds an item to the shopping list.
     * 
     * @param item The item to be added.
     * @return An indication of the item added to the list or
     *         an indication that the item is already in the list.
     */
    public String addItem(String item)
    {
        if(!list.contains(item) ){
            list.add(item);
            return item + " has been added.";
        } else {
            return item + " is already in the list.";
        }
    }

    /**
     * Removes an item from the list.
     * 
     * @param item  The name of the item to be removed from the list.
     * @return An indication that the item was removed from the list or
     *         an indication that the item was not found in the list.
     */
    public String removeItem(String item)
    {
        if (list.contains(item)){ //error on this line; got rid of the !
            list.remove(item);
            return item + " has been removed.";
        } else {
            return item + " is not found in the list.";
        }
    }

    /**
     * Removes all items from the list.
     */
    public void clearList()
    {
        list.clear();//error on this line ; changed from 'list = null'
    }

    /**
     * Returns the number of items in the list.
     * 
     * @return The number of items in the list.
     */
    public int numItems()
    {
        return list.size(); //error on this line; changed from '.length'
    }

    /**
     * Returns a string representation of the items in the list.
     * 
     * @return A string representation of the items in the list.
     */
    public String toString()
    {
        return list.toString();
    }

}
