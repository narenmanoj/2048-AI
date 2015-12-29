package game;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board {

  private int[][] boardValues;
  private int maxVal;
  private int score;

  public enum MoveTypes {
    UP, DOWN, LEFT, RIGHT;
  }

  public Board(int size) {
    boardValues = new int[size][size];
  }

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

  public int[][] getBoardValues() {
    return boardValues;
  }

  public void setBoardValues(int[][] bv) {
    boardValues = bv.clone(); // deep copy the board    
  }

  public int getScore() {
    return score;
  }
}