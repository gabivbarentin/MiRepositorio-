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

public class s08e1gabriela extends PApplet {

//aparece un fondo azul y al apretar una una tecla aparecen c\u00edrculos

int r = 0; //parte en 0
float x, y,cantt , val;
int [] colores;

public void setup() {
  
  //colores de los puntitos
   colores = new int [30];
    colores [0] = color (217, 225, 166);
    colores [1] = color (21, 147, 138);
    colores [2] = color (109, 172, 121);


}
public void draw() {
  background (12, 27, 72);
  translate(width/2, height/2); //el origen est\u00e1 en el centro del canvas.
  pushMatrix();
  rotate(radians(r));
  r--; //giran en sentido contrario de las agujas del reloj.
  cantt= 20; // cantidad de lineas y de grados.
  for(int j = 0; j<cantt;j++){
  for (int i=0; i< val; i++) {


    noStroke();
    fill(colores[i]);
    ellipse(3+ i * 20, y, 12, 12);



  }
  rotate(radians(360/cantt));
  }

  popMatrix();
}

//se agregan c\u00edrculos de puntitos al apretar un bot\u00f3n
public void keyPressed() {
  val++;
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s08e1gabriela" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
