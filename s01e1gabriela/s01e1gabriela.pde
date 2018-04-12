//Universidad del desarrollo - Facultad de diseño - Gabriela Vergara
int a;
int b;
int c;

void setup () {
  size(700,700);

a = 40;
b = 30;
c = 8;

}

void draw () {
  background(90,180,90);
  ellipse(a, b, c, c);
  b ++;
  a ++;

if (b> height){ //cuando b sea mayor que la altura
  b = 0; //vuelve a 0
}
if (a> width){ //cuando a sea mayor a la anchura
  a = 0; //vuelve a 0 
}
}
