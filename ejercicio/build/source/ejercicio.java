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

public class ejercicio extends PApplet {

//comentario de lineas
/*
comentario de bloque

Los pasos de una variable son:
1 declarar
2 iniciar
3 usar

++ significa + 1
-- significa restarle 1

si se ponen en el void draw incrementa o resta 1 durante el tiempo, por ej,
la figura va incrementando su tama\u00f1o en 1.

si se pone +=1 es igual al ++1, pero se puede poner tambi\u00e9n
+=10 y va a incrementar de 10 en 10.
*/

//variables globales(se peuden usar en cualquier lugar).
int a; //variable numeros enteros
float b; //variable decimal
boolean c; // variable binaria true false
String d; //texto c wfowfoef 2
int e; // variable de color

int x;
int y;
int t;

public void setup () {
  
int a = 100; // variable local (se puede usar entre{}).
x = 10;
y = 20;
t = 5;

}

public void draw () {
  background(51);
  ellipse(x, y, t, t);
  x ++;
//cuando la pelota llegue al borde derecho, aparezca e el izquierdo
if (x> width){
  x = 0; //aparezca en el izquierdo
}

}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ejercicio" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
