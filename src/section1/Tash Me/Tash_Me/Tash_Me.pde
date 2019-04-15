PImage face;
PImage moustache;

void setup() {
  size(800, 800);
  face=loadImage("face.jpg");
  moustache=loadImage("moustache.png");
  face.resize(width, height);
  moustache.resize(300, 100);
}

void draw() {
  background(face); 
  if (mousePressed) {
    image(moustache, mouseX-150, mouseY-25);
  }
}