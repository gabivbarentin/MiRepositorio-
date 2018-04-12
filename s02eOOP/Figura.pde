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
  void pelota(float cualquiera){ // se ponen parametros entre
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

  void mover(){
    //movimiento de la ellipse
   x++;
   y--;
  }

  void bordes(){
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
