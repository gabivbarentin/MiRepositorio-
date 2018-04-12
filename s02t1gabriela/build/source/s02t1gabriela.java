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

public class s02t1gabriela extends PApplet {

Pelotita a; //llame a la clase


public void setup(){
  
  a = new Pelotita(10,90,90);
}

public void draw(){
 background(34,199,150);
 a.dibuja();
 a.caca();

}
class Pelotita{
  int t; //variable para tama\u00f1o
  int x; //variable para pocicion
  int y; //variable para pocicion


Pelotita(int t, int x, int y){

  this.t = t;
  this.x = x;
  this.y = y;
}

  public void dibuja(){
    noStroke();
    ellipse(x,y,t,t);
  }
  public void caca(){
  x = x + 1;
  y = y + 1;
}

  }
  public void settings() {  size(400,400); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s02t1gabriela" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
