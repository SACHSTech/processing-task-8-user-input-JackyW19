import processing.core.PApplet;

public class Sketch extends PApplet {
	
	boolean upPressed = false;
  boolean downPressed = false;
  boolean leftPressed = false;
  boolean rightPressed = false;

  float circleX = 150;
  float circleY = 150;
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

    
  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    
    background(255, 255, 255);
    }

  public void draw() {
    
    // set background colour to white
   background(255, 255, 255); 

    // if mouse is pressed, background colour changes to black
    if (mousePressed) {
      background(32);
    } 
    
    else {
      
      // background colour changes accordingly to the first letter of a colour pressed
      if (keyPressed) {

      // change background to red
        if (key == 'r') {
          background(255, 0, 0);
          } 
      //change background to orange
        else if (key == 'o') {
          background(255, 128, 0);
          } 
      //change background to yellow
        else if (key == 'y') {
          background(246, 255, 0);
          } 
      //change background to green
        else if (key == 'g') {
          background(0, 255, 0);
          } 
      // change background to blue
        else if (key == 'b') {
          background(0, 0, 255);
          }
      // change background to purple
        else if (key == 'p') {
          background(170, 0, 255);
          } 
        } 
      // background goes back to white after key is released
        else {
          keyReleased();
          background(255, 255, 255);
          }
      
        // yellow circle moves accordingly to what arrow directions user presses
      if (keyPressed) {
        if (keyCode == UP) {
          circleY--;
        } 
        else if (keyCode == DOWN) {
          circleY++;
        } 
        else if(keyCode == LEFT){
          circleX--;
        }
        else if(keyCode == RIGHT){
         circleX++; 
        }
      }
      // draw circle
        ellipse(circleX, circleY, 50, 50);
          fill(0, 0, 255);
        
      
      // draws a blue rectangle wherever the mouse cursor is
        rect(mouseX, mouseY, 50, 50);
        fill(255, 255, 0);    
    }
  
  }
}