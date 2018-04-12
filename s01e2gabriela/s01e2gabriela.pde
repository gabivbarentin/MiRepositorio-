//Universidad del desarrollo - Facultad de diseño - Gabriela Vergara
int x;
int y;
int t;
int x2;
int y2;

void setup () {
  size(300,300);

x = 300;
y = 150;
t = 8;
x2 = 0;
y2 = 300;

}

void draw () {
  background(90,180,90);
  //azul sin borde
  fill(0,0,255);
  noStroke();
  ellipse(x, y, t, t);
  //borde rojo
  noFill();
  stroke(255,0,0);
  strokeWeight(2);
  //strokeWeight(.2); esto es para poner el borde en o,2 de ancho.

  for(int i = 0;i < 5; i ++){
  int tam = i * 10;
  float r = random (-5.5); //para que cambie aleatoriamente de posicion entre
  //-5 y 5 en el eje y
  ellipse(x2,y2 + r,tam,tam);
}

  //y --; // no se está moviendo en este eje
  x --; //de derecha a izquierda en el eje Y

  x2++;
  y2--;
  t--;

if (y> height){
  y = 0;

}
if (x< 0){ //cuando la pelota llega a 0
  x = 300; //parte de nuevo desde 300
  t= 20; // para que parta chiquitito
}

  if (x2 > width){
    x2 = 0;
  }
  if (y2 < 0){
    y2 = height;

  }
}
