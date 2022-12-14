package Crossword;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Puzzle puzzle = new Puzzle();
        Board board = new Board();
        puzzle.setWords();
        System.out.println(puzzle.wordList[0].getNumber() +" "+puzzle.wordList[0].getClue() +" " +puzzle.wordList[0].getAnswer());
        System.out.println(Arrays.deepToString(board.createBoard(puzzle)));
        puzzle.wordList[0].getAnswerLetters();
    }
}
