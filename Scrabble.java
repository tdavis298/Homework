import java.util.Scanner;
//imports the scanner class
import java.util.Arrays;
//imports the arrays class
public class Scrabble {
  public static void main(String[] args) throws Exception {
    int y = 0;
  Scanner s = new Scanner(System.in);
  Scanner su = new Scanner(System.in);
  String[] tiles = new String[7];
  //Creates new scanners to take user input

  System.out.println("Please enter up to 7 letters one at a time: ");
  //Seven is the max number of tiles in Scrabble

  for (int i = 0; i < tiles.length; i++) {
    tiles[i] = s.nextLine();
    //takes up to 7 tiles and puts them in an array
  }
  String[] word = new String[1];
  //creates array to take the word

  System.out.println("Enter word: ");
  //asks user for word

  for (y = 0; y < word.length; y++) {
    String[] wordArray = s.nextLine().split("");
  }


  //Just to test
  System.out.println(Arrays.toString(tiles));
  System.out.println(Arrays.toString(word));
}
}
