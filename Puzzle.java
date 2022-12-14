package Crossword;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Puzzle {
public int numOfWords = 5;

public Words wordList[] = new Words[numOfWords];
public void setWords(){ 
    for(int i = 0; i<=numOfWords-1; i++){
        wordList[i] =new Words(i,rand());
    }
    }
    //random number between 1 and number of lines
    ArrayList<Integer> previousRand = new ArrayList<Integer>();
    public int rand(){
        int numOfLines = 0; 
        int rand = 0;
        try 
        {
            Scanner sc = new Scanner(new File("/workspace/myCodeEmporium/Crossword/Answers.txt"));
            while (sc.hasNextLine())
            {
                sc.nextLine(); //neccessary to count lines for some reason
                numOfLines++;
            }
        } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
        int randomInt = (int) ((Math.random() * numOfLines) + 1);
        rand = randomInt;
        while(previousRand.contains(rand)){
                randomInt = (int) ((Math.random() * numOfLines) + 1);
                rand = randomInt;
            }
            previousRand.add(rand);
            return rand;
    }
    public int getNumOfWords(){
        return numOfWords;
    }

}
