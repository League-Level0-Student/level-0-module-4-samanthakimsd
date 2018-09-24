PImage donkey;
PImage tail;
void setup(){
size(1000,700);
  donkey = loadImage("donkey.jpg");      
tail = loadImage("tail.png");    
size(width, height);
}

void draw(){
background ("donkey.jpg");
image(tail, mouseX, mouseY);

}