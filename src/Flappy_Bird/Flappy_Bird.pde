float birdx=200;
float birdy=400;
float birdvel;
float pipex=700;
float pipey=0;
float pipeheight=400;
float pipespeed=1;
float jumptimer;
int score;
boolean hit;

void setup(){
  size(800,800);
}

void draw(){
  fill(#000000);
  stroke(#000000);
  textSize(30);
  text("Score: "+score,400,200);
  pipespeed+=0.002;
  background(#60CEC8);
  fill(#3DA745);
  ellipse(birdx,birdy,50,50);
  fill(#2C7131);
  rect(pipex,pipey,50,pipeheight);
  
  rect(pipex,pipey+pipeheight+200,50,height-pipeheight-200);
  pipex-=pipespeed;
  
  
  
  if(pipex+50<0){
   score++;
   pipex=800;
   pipeheight=random(0,800);
  }
  
  
  hit();
  birdMove();
}

void birdMove(){
 birdy-=birdvel;
 birdy+=2;
 if(keyPressed && key==' ' && jumptimer<=0){
   birdvel=15;
   jumptimer=20;
 }
 birdvel--;
 jumptimer--;
 if(birdvel<=0){
  birdvel=0; 
 }
 if(birdy-25<0){
  birdy=25; 
 }
}

void hit(){
  if(birdx+25>pipex && birdx-25<pipex+50 && birdy+25>pipey+pipeheight+200 && birdy-25<pipey+height){
   hit=true; 
  }
  
  else if(birdx+25>pipex && birdx-25<pipex+50 && birdy+25>pipey && birdy-25<pipey+pipeheight){
   hit=true; 
  }
  else if(birdy+25>height){
   hit=true; 
  }
  else{
   hit=false; 
  }
}