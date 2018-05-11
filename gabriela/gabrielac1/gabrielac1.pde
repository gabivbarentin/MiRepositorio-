
ArrayList<Circulos> lista = new ArrayList<Circulos>();
Circulos c;

void setup(){
  size (800, 800);
  for(int i = 0; i<23; i++){
  c = new Circulos(i);
  lista.add(c);
  }
}

void draw(){
  background(c.colores [23]);

  for(Circulos a: lista){
    a.cir();
 }


}
