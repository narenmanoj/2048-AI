package game;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/*
my representation of a board. I think this
interface is complete and no new public
methods should be added
*/
public class Board {

  // holds the integer values of each square.
  // if the value at some square is 0, then the 
  // square is interpreted to be empty
  private int[][] boardValues;

  // keeps track of the maximum value on this board
  private int maxVal;

  // keeps track of the score
  private int score;

  /*
  these are the possible moves that can be made (only four possible
  controls denoted by four keypresses)
  */
  public enum MoveTypes {
    UP, DOWN, LEFT, RIGHT;
  }

  /*
  constructs a board of dimensions sxs
  */
  public Board(int s) {
    boardValues = new int[s][s];
  }

  /*
  returns a new Board that is generated after
  a certain move is applied. this includes the
  random addition of a new square to the board

  STILL INCOMPLETE
  */
  public static Board move(Board b, MoveTypes m) {
    int[][] boardValues = b.getBoardValues();
    int height = boardValues.length;
    int width = boardValues[0].length;
    switch(m) {
      case LEFT:
        // iterate on the rows
        for(int i = 0; i < height; i++ ) {
          for(int emptyTilePointer = 0; emptyTilePointer < width; emptyTilePointer++ ) {
            if(boardValues[i][emptyTilePointer] == 0) {
              // we have reached an empty space
              for(int j = emptyTilePointer + 1; j < width; j++ ) {
                boardValues[i][j - 1] = boardValues[i][j]; 
              }
            }
          }
          // now we have completed the left shift

        }
      case RIGHT:
      case UP:
      case DOWN:
    }
    return null;
  }

  /*
  gets the integer array representation of the board
  */
  public int[][] getBoardValues() {
    return boardValues;
  }

  /*
  sets the integer representation of this board to
  a copy of another integer array passed in as a parameter
  */
  public void setBoardValues(int[][] bv) {
    if(bv.length != bv[0].length) {
      return;
    }
    boardValues = bv.clone(); // deep copy the board    
  }

  /*
  gets the score of this board
  */
  public int getScore() {
    return score;
  }
}