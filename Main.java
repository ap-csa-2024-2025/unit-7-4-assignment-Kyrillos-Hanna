import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> input = new ArrayList<String>();
    ArrayList<String> input2 = new ArrayList<String>();

    String word = "";
    String letter = "";
    String inputString = "";
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!word.equals("STOP"))
    {
      word = sc.nextLine();
      input.add(word);
    }
    input.remove("STOP");
    System.out.println("Enter the letter to search for");
    letter = sc.nextLine();
    System.out.println("Search for " + letter + ": " + countSecondInitial(input, letter));
    
    word = "";
    System.out.println("\nPlease enter words, enter STOP to stop the loop.");
    while (!word.equals("STOP"))
    {
      word = sc.nextLine();
      input2.add(word);
    }
    input2.remove("STOP");
    System.out.println("Enter String to search for");
    inputString = sc.nextLine();
    System.out.println("searchSecond returns: " + searchSecond(input2, inputString));
  }

  /** Returns the number of Strings in the ArrayList that has the letter
   * as the second letter in that word.
   * Precondition: The arr is not null, and is not empty.
   * Precondition: The letter is exactly one letter.
   */
  public static int countSecondInitial(ArrayList<String> arr, String letter)
  {
    int count = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i).substring(1, 2).equals(letter)) {
        count++;
      } 
    }
    return count;
  }

  /** Returns the index of the second occurrence of target within the ArrayList
   * If the target is not found, or is only found once, then -1 is returned.
   * Precondition: Neither arr nor target are null.  The arr is non-empty.
   */
  public static int searchSecond(final ArrayList<String> arr, String target)
  {
    int count = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i).equals(target)) {
        count++;
        if (count >= 2) {
          return i;
        }
      }
    }
    return -1;
  }
}
