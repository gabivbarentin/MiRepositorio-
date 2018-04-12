class Pelotita{
  int t; //variable para tamaño
  int x; //variable para pocicion
  int y; //variable para pocicion


Pelotita(int t, int x, int y){

  this.t = t;
  this.x = x;
  this.y = y;
}

  void dibuja(){
    noStroke();
    ellipse(x,y,t,t);
  }
  void caca(){
  x = x + 1;
  y = y + 1;
}

  }
