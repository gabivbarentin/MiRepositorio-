import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class s05e1gabriela extends PApplet {

//se ver\u00e1 una grilla muy mal medida de circulos
public void setup(){
  
  ellipse(250,250,5,5);
  ellipse(250,450,5,5);
  ellipse(250,600,5,5);
  ellipse(250,750,5,5);

  ellipse(340,250,5,5);
  ellipse(340,450,5,5);
  ellipse(340,600,5,5);
  ellipse(340,750,5,5);

  ellipse(410,250,5,5);
  ellipse(410,450,5,5);
  ellipse(410,600,5,5);
  ellipse(410,750,5,5);

  ellipse(500,250,5,5);
  ellipse(500,450,5,5);
  ellipse(500,600,5,5);
  ellipse(500,750,5,5);

  }
  public void settings() {  size(1000,1000); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s05e1gabriela" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
