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

public class s04e0gabriela extends PApplet {

ArrayList<Circulos> lista = new ArrayList<Circulos>();
Circulos c;


public void setup(){
  
  for (int i = 0; i < 4; i++){
    c = new Circulos();
    lista.add(c);
  }

}

public void draw(){

//  frameRate(30);
  background(255);
  for (Circulos a: lista){
  a.tamano();
//  a.bordes();
  a.mov();
  a.salida();

  }
for (int i =lista.size()-1; i >= 0; i--){
  Circulos c = lista.get(i);
  if(c.salida()){ // al ser boolean, al poner () significa: true.
    lista.remove(i);
  }
}
}
/*void keyPressed(){
  if(key== ' '){
    Circulos c = new Circulos(mouseX, mouseY,10);
    lista.add(c);
  }
}
*/
class Circulos{

  float x,y,t,velx,vely;

Circulos(){

x = random(0,500);
y = random(0,500);
t = random(10,30);

velx = random(-1,1);
vely = random(-1,1);
}
  public void tamano(){
fill (0);
    ellipse(x,y,t,t);
  }
public void mov(){


  x += velx;
  y += vely;
}

/*  void bordes(){
    if (x > width || x < 0 || y > height || y < 0){
      x= width/2;
      y= height/2;
    }
  }
  */

  public boolean salida(){ //al usar este se comenta el void bordes
      if (x > width || x < 0 || y > height || y < 0){
      return true;
    } else {
      return false;
    }
  }
}
  public void settings() {  size(500,500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s04e0gabriela" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
