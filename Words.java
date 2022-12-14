package Crossword;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
public class Words {
  String clue = "";
  String answer = "";
  int number =0;
  int length =0;
  boolean horizontal;
  String[] answerLetters;
  //Constructor for the words
  Words(int num, int random){
    number = num;
    clue = setClue(random);
    answer = setAnswer(random);
    if(number%2==0){horizontal=true;}
    else{horizontal = false;}
    length = answer.length();
    answerLetters = new String[length];
    for(int i =0; i<length;i++){
      answerLetters[i]= answer.substring(i,i+1);
    }
  }
  public String setClue(int num){
    String tempPhrase = "brokey";
    try{
      int count = 0;
      Scanner sc = new Scanner(new File("/workspace/myCodeEmporium/Crossword/Clues.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == num){tempPhrase = temp;}
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    return tempPhrase;
  }
  public String setAnswer(int num){
    String tempPhrase = "brokey";
    try{
      int count = 0;
      Scanner sc = new Scanner(new File("/workspace/myCodeEmporium/Crossword/Answers.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == num)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    //remove spaces and capitalize
    return tempPhrase;
  }
  //getter
  public String getAnswer(){
    return answer;
  }
  public String getClue(){
    return clue;
  }
  public int getNumber(){
    return number;
  }
  public int getLength(){
    return length;
  }
  public void getAnswerLetters(){
    System.out.println(Arrays.toString(answerLetters));
  }
  public boolean getHorizontal(){
    return horizontal;
  }
}

