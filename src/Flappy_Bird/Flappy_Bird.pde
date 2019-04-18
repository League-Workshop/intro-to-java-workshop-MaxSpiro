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
boolean dead;
float gravity=2;

void setup() {
  size(800, 800);
}

void draw() {
  background(#60CEC8);
  fill(#000000);
  stroke(#000000);
  textSize(30);
  text("Score: "+score, 300, 100);
  
  pipespeed+=0.002;
  
  fill(#3DA745);
  ellipse(birdx, birdy, 50, 50);
  fill(#2C7131);
  rect(pipex, pipey, 50, pipeheight);

  rect(pipex, pipey+pipeheight+150, 50, height-pipeheight-150);
  if (hit==true) {
    dead=true;
  }
  if (dead==false) {
    pipex-=pipespeed;
  }
  gravity+=0.0002;
  

  if (pipex+50<0) {
    score++;
    pipex=800;
    pipeheight=random(0, height-150  );
  }


  hit();
  birdMove();
}

void birdMove() {
  if(keyPressed && keyCode==SHIFT){
    birdy+=4;
  }
  birdy-=birdvel;
  birdy+=gravity;
  if (dead==false) {
    if (keyPressed && key==' ' && jumptimer<=0) {
      birdvel=15;
      jumptimer=15;
    }
  }
  birdvel--;
  jumptimer--;
  if (birdvel<=0) {
    birdvel=0;
  }
  if(birdy+25>height && dead==true){
   pipex=width;
   score=0;
   pipespeed=1;
   birdx=200;
   birdy=400;
   gravity=2;
   dead=false;
  }
  if (birdy-25<0) {
    birdy=25;
  }
}

void hit() {
  if (birdx+25>pipex && birdx-25<pipex+50 && birdy+25>pipey+pipeheight+150 && birdy-25<pipey+height) {
    hit=true;
  } else if (birdx+25>pipex && birdx-25<pipex+50 && birdy+25>pipey && birdy-25<pipey+pipeheight) {
    hit=true;
  } else if (birdy+25>height) {
    hit=true;
  } else {
    hit=false;
  }
}