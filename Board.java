package Crossword;
public class Board {
    public int boardSize(Puzzle puzzle){
        int longestWord = 0;
        for(int i = 0;i<=(puzzle.getNumOfWords()-1); i++){
            if(longestWord<puzzle.wordList[i].getLength()){
                longestWord = puzzle.wordList[i].getLength();
            }
        }
        return longestWord;
    } 
    public int getSize(Puzzle puzzle){
        int size = boardSize(puzzle);
        return size;
    }
    public String[][] createBoard(Puzzle puzzle){
        int size = boardSize(puzzle);
        String[][] board = new String[size][size];
        for(int i = 0; i<puzzle.getNumOfWords();i++){
        if(puzzle.wordList[i].getHorizontal()==true){
            for(int x = 0; x<puzzle.wordList[i].getLength();x++){
                board[i][x]= puzzle.wordList[i].answerLetters[x];
            }
        }
        else if(puzzle.wordList[i].getHorizontal()==false){
            for(int x = 0; x<puzzle.wordList[i].getLength();x++){
                board[x][i]= puzzle.wordList[i].answerLetters[x];
            }   
        }
    }
    for(int x = 0; x<size;x++){
        for(int y = 0; y<size;y++){
            if(board[x][y]==null){board[x][y]=" ";}
        }
    }   
        return board;
    }
     //if(puzzle.wordList[].getAnswer.contains(board[][])) .
}
