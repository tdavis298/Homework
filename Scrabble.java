/**Tucker Davis
*9/2/2017
*This is a simple program that uses user input to determine if a number of
*letters on "Scrabble tiles" can form a word.*/

import java.util.Scanner;
//imports the scanner class
import java.util.Arrays;
//imports the arrays class
public class Scrabble {
  public static void main(String[] args) throws Exception {
    int y = 0;
    int t = 0;
    Scanner s = new Scanner(System.in);
    Scanner su = new Scanner(System.in);
    //Creates new scanners to take user input

    String[] tiles = new String[7];
    //Creates the array to take the letters

    System.out.println("Please enter up to 7 letters one at a time: ");
    //Seven is the max number of tiles in Scrabble

    for (int i = 0; i < tiles.length; i++) {
      tiles[i] = s.nextLine();
      }
    //takes up to 7 tiles and puts them in an array

    System.out.println("Enter word: ");
    //asks user for word

    String[] word = su.nextLine().split("");
    //Creates an array to take the word

    int u = word.length;

    //Used for testing
    //System.out.println(Arrays.toString(tiles));
    //System.out.println(Arrays.toString(word));

    for (int x = 0; x < word.length; x++){
      for(int z = 0; z < tiles.length; z++){
        String letter = word[x];
        String letterone = tiles[z];
        int result = letter.compareTo(letterone);
        if(result == 0){
          t = t + 1;
        }
        //prints the comparison of each letter in the word to each letter
        //in the tiles, with the difference between the placements in the
        //alphabet being the number it returns
      }
    }
    //Used for testing
    //System.out.println("split");
    //System.out.println(t);
    if(t >= u){
      System.out.println("Can create word.");
    } else {System.out.println("Cannot create word.");
    }
    //every time the compareTo class returns a value of 0, the int t has
    //one added to it. If the result of t is greater than or equal to
    //the length of the word, there must be enough letters to create it.
  }
}
