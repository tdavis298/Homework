import java.util.Scanner;
//imports the scanner class
import java.util.Arrays;
//imports the arrays class
public class Scrabble {
  public static void main(String[] args) throws Exception {
    int y = 0;
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

    //Just to test
    System.out.println(Arrays.toString(tiles));
    System.out.println(Arrays.toString(word));

    for (int x = 0; x < word.length; x++){
      for(int z = 0; z < tiles.length; z++){
        String letter = word[x];
        String letterone = tiles[z];
        int result = letter.compareTo(letterone);
        System.out.println(result);
        //prints the comparison of each letter in the word to each letter
        //in the tiles, with the difference between the placements in the
        //alphabet being the number it returns
      }
    }
  }
}
