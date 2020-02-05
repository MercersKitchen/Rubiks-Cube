float rotation=0;

color purple = #C433B6;

color black = #000000;
int rubiksCube = 300;
boolean startGame = false;

int v=3;
int w=3;
int colors=6;

int l;
int m;
int n;
int sub;

float sz = 240/v;
float sze= sz*.8;

int [][][]block = new int [v][w][colors];

void setup() {
  size(600,600,P3D);
  textSomething();
  //noStroke();
  strokeWeight(5);
  noFill();
  rectMode(CENTER);
  for(int l=0; l<v; l++){
    for(int m=0; m<w; m++){
    for(int n=0; n<colors; n++){
    block[l][m][n]=n;
    }
    }
    }
}

void draw() {
  background(purple);
  noStroke();
  textDraw();
     fill(255);
  stroke(0);
  fill(0);

  //text(nf(millisecs,1),mouseX,mouseY);
  translate(width/2,height/2);
  rotateX(-mouseY*PI/300);
  rotateY(-mouseX*PI/300);
  //noFill();
  box(239);
  for(int l=0; l<v; l++){
  for(int m=0; m<w; m++){
  for(int n=0; n<colors; n++){
    if (n==0){ //green
      pushMatrix();
      translate(v*sz/2,0,0);
      rotateY(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0+.5),sz*(m-w/2.0+.5),sze,sze);
      popMatrix();
    }
    if (n==1){ //blue
      pushMatrix();
      translate(-v*sz/2,0,0);
      rotateY(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0+.5),sz*(m-w/2.0+.5),sze,sze);
      popMatrix();
    }
    if (n==2){ //white
      pushMatrix();
      translate(0,w*sz/2,0);
      rotateX(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0+.5),sz*(m-w/2.0+.5),sze,sze);
      popMatrix();
    }
    if (n==3){ //yellow
      pushMatrix();
      translate(0,-w*sz/2,0);
      rotateX(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0+.5),sz*(m-w/2.0+.5),sze,sze);
      popMatrix();
    }
    if (n==4){ //red
      pushMatrix();
      translate(0,0,w*sz/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0+.5),sz*(m-w/2.0+.5),sze,sze);
      popMatrix();
    }
    if (n==5){ //orange
      pushMatrix();
      translate(0,0,-w*sz/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0+.5),sz*(m-w/2.0+.5),sze,sze);
      popMatrix();
    }
  }
  }
  }
 
  rotation++;


  //println ("mousex:", mouseX, "\tmouseY:", mouseY);
}
void keyPressed() {
rootate();
}

void mousePressed(){

}
