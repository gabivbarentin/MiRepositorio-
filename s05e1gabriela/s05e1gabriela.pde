void setup(){
  size(1000,1000);
  for(int i= 0;i <4;i ++){
    for (int j = 0; j <5; j++) {
    float x = map(i, 0, 3, width * .25, width * 5); //map solo entrega float.
    // de 0 a 3 pq es < 4. .25 es el punto 25. es lo mismo que width/4
    //.5 es 1000 divivido en 2 es 500. 
    float y = map(j, 0, 4, height * .25, height * .75);
    ellipse (x, y, 10, 10);
  }
}
}
