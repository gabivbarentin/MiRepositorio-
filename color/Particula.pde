class Particula{
  color [] colores;
  color propioDelObjeto;
  int randomColor;
  float x, y, velx, vely, tamano;

  Particula(int i){
    this.randomColor = int(random(3));
    colores = new color[3];
    colores [0] = color (255,0,0);
    colores [1] = color (0,255,0);
    colores [2] = color (0,0,255);
    propioDelObjeto = colores [randomColor];
    //x = i*25 + 5;
    x = width/2;
    y = height/2;

    velx = random(-10,10);
    vely = random(-10,10);

    x += velx;
    y += vely;
    tamano = random (10,30);

  }

  //descripcion
  void show (int eleccion){

    if(eleccion== 0){
    fill(propioDelObjeto);
    ellipse(x, y, tamano, tamano);
  }
else if(eleccion==1){
    fill(colores[0]);
    rect(x, height/2, 30, 30);
    }
}

void mover (int eleccion){
  if (eleccion == 0){
    x += velx;
    y += vely;
  }
  else if (eleccion == 1){
    x--;
  }
}
  void denuevo (){
    if(x> width || x < 0 || y > height || y < 0){
      x = width/2;
      y = height/2;
      tamano = random(10,30);
      propioDelObjeto = color (0);

    }
  }
}
