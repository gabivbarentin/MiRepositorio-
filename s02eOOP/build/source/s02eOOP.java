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

public class s02eOOP extends PApplet {

//archivo principal del programa
Figura f; //declara
Figura g;
float x;
public void setup(){
  
  f = new Figura (10, 10, 20);// inicializa
  g = new Figura (width/2, height/2, 5);
}

public void draw(){
  background(0);
  f.pelota(51); //uso. f en minuscula por que es objeto
  f.mover();
  f.bordes();

  g.pelota(x); //como x no tiene valor, por defecto es 0.
  x+= 0.2f; // cambia el color por que esta puesto "cualquiera"
  //en el parametro de fill en la clase.
  g.mover();
  g.bordes();
}
//Archivo de la clase
class Figura { // F en mayuscula por que es class
  int x;
  int y;
  int t;
  Figura (int x, int y, int t){ // _x = pasar por referencia

    this.x = x; //la x de la figura
    this.y = y;
    this.t = t;
  }

  //metodo figura ellipse
  public void pelota(float cualquiera){ // se ponen parametros entre
  //  el () para poder cambiarlos en los objetos
  //se puede poner float y una palabra para poner numeros
  //decimales. se puede poner int con una palabra y luego
  //poner numeros enteros. se puede poner String una palabra.

  //al usar float tambien se pueden usar numeros enteros.
    noStroke();
    fill(cualquiera); //puego en donde se quiere cambiar
    //el parametro se pone la palabra mencionada anteriormente
    ellipse(x,y,t,t);
  }

  public void mover(){
    //movimiento de la ellipse
   x++;
   y--;
  }

  public void bordes(){
    //condicionantes bode para una ellipse
  //    if (x > width/random(600)){
    if (x > width){
      x = 0;
      t = 60;
    }
    if (y < 0){
      y = height;
    }
  }
}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "s02eOOP" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
