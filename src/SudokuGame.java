import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Image;

import java.awt.Color;

public class SudokuGame {
    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;
    private static int lives = 3;
    private CanvasWindow canvas;  
    private Image board = new Image(100, 300,"Sudoku.png"); // FIX ME

    public SudokuGame(){
        canvas = new CanvasWindow("Sudoku!", CANVAS_WIDTH,CANVAS_HEIGHT);
        canvas.setBackground(Color.WHITE);
        GraphicsText livesText = new GraphicsText("Lives Left: " + lives, 500, 15);
        livesText.setFillColor(Color.WHITE);
        canvas.add(livesText);
        canvas.add(board); //should add a screenshot of a blank sudoku board
        canvas.draw();
   }
}

