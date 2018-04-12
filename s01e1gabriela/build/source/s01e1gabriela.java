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

public class s01e1gabriela extends PApplet {

//Universidad del desarrollo - Facultad de dise\u00f1o - Gabriela Vergara
int a;
int b;
int c;

public void setup () {
  

a = 40;
b = 30;
c = 8;

}

public void draw () {
  background(90,180,90);
  ellipse(a, b, c, c);
  b ++;
  a ++;

if (b> height){ //
  b = 0;
}
if (a> width){
  a = 0;
}
}
  public void settings() {  size(700,700); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s01e1gabriela" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
