void setup(){
size(600,400);
mouseX = 150;
mouseY = 230;

}



void draw(){
  if(mousePressed){
println(mouseX+" "+mouseY);
}
if(mouseX<56){mouseX=56;}
if(mouseX<76){mouseX=76;}


fill(#FFFFFF);
ellipse(150,200,250,175);
ellipse(450,200,250,175);

fill(#000000);
ellipse(mouseX,mouseY,70,70);
ellipse(mouseX + 300,mouseY + 0,70,70);


}