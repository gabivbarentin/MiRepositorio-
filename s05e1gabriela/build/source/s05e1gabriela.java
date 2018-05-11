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

public void setup(){
  
  for(int i= 0;i <4;i ++){
    for (int j = 0; j <5; j++) {
    float x = map(i, 0, 3, width * .25f, width * .5f); //map solo entrega float.
    // de 0 a 3 pq es < 4. .25 es el punto 25. es lo mismo que width/4
    //.5 es 1000 divivido en 2 es 500.
    float y = map(j, 0, 4, height * .25f, height * .75f);
    ellipse (x, y, 10, 10);
  }
}
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
