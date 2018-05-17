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

public class gabrielac1 extends PApplet {

// Universidad del Desarrollo - Facultad de Dise\u00f1o - Certamen 1 - Gabriela Vergara Barentin.
ArrayList<Circulos> lista = new ArrayList<Circulos>();  // Se crea una lista de la clase Circulos.

// Se declaran las variables globales.
Circulos c;  // La clase se nombra con c.
int n;
int val = 0;
int var1 = 1;
int var2 = 0;
int var3 = 0;

public void setup() {
  
  for (int i = 0; i < 28; i++) {   // Se dibujan 28 c\u00edrculos de la lista a.cir()
    c = new Circulos(i);
    lista.add(c);
  }
}

public void draw() {
  background(c.colores [2]);
  // Se les da un valor a cada lista para luego ser llamadas con keyPressed().
  if (var1 == 1) {
    for (Circulos a : lista) {
      a.cir();
    }
  }
  if (var2 == 1) {
    c.anillos();
  }
  if (var3 == 1) {
    c.cuadrados();
  }
}

public void keyPressed() {
  if (key =='0') { // Cambio sentido anillos.
    n= 0;
  }
  if (key == '1') { // Cambio sentido anillos.
    n= 1;
  }
  if (key == 'v') { // Resto anillos.
    val--;
  }
  if (key == 'w') {  // Sumo anillos.
    val++;
  }
  if (key == 'a') { // Se abre a.cir().
    var1 = 1;
    var2 = 0;
    var3= 0;
  }
  if (key == 's') {  // Se abre c.anillos().
    var1 = 0;
    var2 = 1;
    var3= 0;
  }
  if (key == 'd') { // Se abre c.cuadrados();
    var1 = 0;
    var2 = 0;
    var3= 1;
  }
}
// Universidad del Desarrollo - Facultad de Dise\u00f1o - Certamen 1 - Gabriela Vergara Barentin
class Circulos {
  // Se declaran las variables globales:
  int [] colores;
  int x, y, tam, p, q, cant, from, to, col;
  int r = 0;
  float cantt, di, dMap;
  int [] paleta = {0xffD9E1A6, 0xff15938A, 0xff6DAB79, 0xff003443}; // C\u00f3digo de colores de void anillos.
  int f;

  Circulos(int i) {
    colores = new int [7]; // Lista de colores.
    colores[0] = color(150, 74, 129); // Rosado.
    colores[1] = color(64, 54, 133); // Lila.
    colores[2] = color(12, 27, 72); // Azul, color de fondo.
    colores[3] = color(230, 183, 120); // Naranjo claro.
    colores[4] = color(205, 109, 98); // Naranjo.
    colores[5] = color(196, 64, 60); // Rojo.
    colores[6] = color(139, 32, 82); // Morado.

    // Se declara el valor de or\u00edgen de las siguientes variables:
    x = 75;  // Posici\u00f3n en x.
    y = 75;  // Posici\u00f3n en y.
    tam = 8; // Tama\u00f1o de circulos de void cir().
    q = i * 15; // Velocidad.
    cant = 24; // Cantidad de c\u00edrlulos de void cir() y grados en torno al or\u00edgen width/2, height/2.

    from= color(150, 74, 129); // Desde el color rosado.
    to= color(64, 54, 133);  // Al color lila.
    col= lerpColor(from, to, .70f);  // Pinta con el 70 porciento entre el color rosado al lila.
  }

  public void cir() {
    if (n == 0) {
      q++; //  El aro gira hacia la derecha.
      p++; // El anillo gira hacia la derecha.
    } else if (n == 1) {
      q--; // El aro gira hacia la izquierda.
      p--; // El anillo gira hacia la izquierda.
    }
    // Construcci\u00f3n de un anillo de c\u00edrculos.
    pushMatrix();
    translate(width / 2, height / 2); // Nuevo centro, si no, girar\u00edan en torno a 0,0.
    rotate(radians(q)); // Rotaci\u00f3n en torno al nuevo or\u00edgen (width/2, height/2).
    pushMatrix();
    translate(width / 4, height / 4); // Los c\u00edrculos peque\u00f1os giran en torno al c\u00edrculo que forman.
    rotate(radians(p));  //  Rotaci\u00f3n en torno al or\u00edgen (width/4, height/4).
    for (int i = 0; i < cant; i++) {
      noStroke();
      fill(col);
      ellipse(x, y, tam, tam); // Dibujo de ellipse.
      rotate(radians(360 / cant));  // Dibujar cada "cant" grados entre los 360\u00ba de un c\u00edrculo, en torno al or\u00edgen (width/4, height/4).
    }
    popMatrix();
    popMatrix();
  }

  public void anillos() {
    // Construcci\u00f3n anillos de c\u00edrculos.
    pushMatrix();
    translate(width / 2, height / 2); // Nuevo or\u00edgen.
    rotate(radians(r)); // Giro en torno al or\u00edgen.
    r++; // Giran hacia la derecha.
    cantt= 40; // cantidad de l\u00edneas y de grados.
    for (int k = 0; k < cantt; k++) {
      for (int l = 0; l < val; l++) {
        noStroke();
        f= paleta [l % 4]; // 4 = Cantidad de colores que iran en l.
        fill(f, k * 5); // 5 = Nivel de opacidad en k.
        ellipse(2+ l * 25, 0, 10, 10); // Dibujo de ellipse.
      }
      rotate(radians(360 / cantt)); // Dibujar cada "cantt" grados entre los 360\u00ba de un c\u00edrculo, en torno al or\u00edgen (width/2, height/2).
    }
    popMatrix();
  }

  public void cuadrados() {
    // Contrucci\u00f3n de cuadrados.
    rectMode(CENTER); // Se dibujan los rect\u00e1ngulos desde el centro.
    noStroke();
    for (int i = 30; i < width; i+= 50) { // Desde el pixel 30 dibuja 50 cuadrados hasta el ancho.
      for (int j = 30; j < height; j+= 50) {  // Desde el pixel 30 dibuja 50 cuadrados hasta el largo.
        di = dist(mouseX, mouseY, i, j);  // Distancia entre los cuadrados.
        dMap = map(di, 300, 0, 0, 25);  // Mapa de posici\u00f3n de cuadrados. Los cuadrados se agrandan al pasar el mouse en una circunferencia de 300 pixeles.
        if (dMap <= 0) dMap = 0;
        if (dMap < 4) {  // Si dMap es menor a 4, pinta de color naranjo claro.
          fill(colores [3]);
        } else if (dMap <= 10) {  // Si dMap es menor o igual a 10, pinta de color naranjo.
          fill(colores [4]);
        } else if (dMap <= 13) { // Si dMap es menor o igual a 13, pinta de color rojo.
          fill(colores [5]);
        } else if (dMap > 15 ) { // Si dMap es mayor a 15, pinta de color morado.
          fill(colores [6]);
        }
        if (i < mouseX) {  // En el eje x, los cuadrados se acercan al mouse desde la derecha i-dMap y desde la izquierda i+dMap. Se acerca 2 pixeles.
          rect(i+ dMap, j, dMap +2, dMap +2);
        } else {
          rect(i- dMap, j, dMap +2, dMap +2);
        }

        if (j < mouseY) {  // En el eje y, los cuadrados se acercan al mouse desde arriba j-dMap y desde abajo j+dMap.  Se acerca 2 pixeles.
          rect(i, j+ dMap, dMap +2, dMap +2);
        } else {
          rect(i, j- dMap, dMap +2, dMap +2);
        }
      }
    }
  }
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "gabrielac1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
