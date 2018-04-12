//archivo principal del programa
Figura f; //declara
Figura g;
float x;
void setup(){
  size(600,600);
  f = new Figura (10, 10, 20);// inicializa
  g = new Figura (width/2, height/2, 5);
}

void draw(){
  background(0);
  f.pelota(51); //uso. f en minuscula por que es objeto
  f.mover();
  f.bordes();

  g.pelota(x); //como x no tiene valor, por defecto es 0.
  x+= 0.2; // cambia el color por que esta puesto "cualquiera"
  //en el parametro de fill en la clase.
  g.mover();
  g.bordes();
}
