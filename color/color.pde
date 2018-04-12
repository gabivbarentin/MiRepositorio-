//vamos a trabajar con colores

ArrayList<Particula> lista = new ArrayList<Particula>();
Particula p;
int n,m;

void setup(){
  size(400,400);
  for (int i = 0; i < 200; i++){
    p = new Particula(i);
    lista.add(p);
  }
}

void draw (){

  background(255);
  for (Particula a: lista){ //llama a todas las cosas de las siguientes listas
    a.show(n);//modificara la eleccion
    a.mover(m);
    a.denuevo();
  }

  if(frameCount % 60 == 0){ //cada 60 frames cambia de direccion
  // m = int (random(2)); // m toma el valor de un numero al azar entre 0 y 2.
  //por el random puede no cambiar la direccion
    // puede elegir 0,0,0,0,1,0,1,1,0,1,0... por ej
    //al ponerle el int al random solo va a cambiar en tre numeros
    //enteros, en este caso 0 y 1.
  }
}

void keyPressed(){
  if (key== '1'){ // se vuelven cuadrados
    n = 1;
  }
  else if (key== '0'){ // se vuelven circulos
    n = 0;
  }
  else if (key == 'd'){ // al apretar d se van a la derecha
    m = 0;
  }
  else if (key == 'i'){ // al apretar i se va a la izquieda
    m = 1;
  }
}
