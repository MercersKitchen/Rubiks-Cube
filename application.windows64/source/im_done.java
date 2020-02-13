import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class im_done extends PApplet {

float rotation=0;

int purple = 0xffC433B6;

int black = 0xff000000;
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
float sze= sz*.8f;

int [][][]block = new int [v][w][colors];

public void setup() {
  
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

public void draw() {
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
      rect(sz*(l-v/2.0f+.5f),sz*(m-w/2.0f+.5f),sze,sze);
      popMatrix();
    }
    if (n==1){ //blue
      pushMatrix();
      translate(-v*sz/2,0,0);
      rotateY(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0f+.5f),sz*(m-w/2.0f+.5f),sze,sze);
      popMatrix();
    }
    if (n==2){ //white
      pushMatrix();
      translate(0,w*sz/2,0);
      rotateX(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0f+.5f),sz*(m-w/2.0f+.5f),sze,sze);
      popMatrix();
    }
    if (n==3){ //yellow
      pushMatrix();
      translate(0,-w*sz/2,0);
      rotateX(PI/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0f+.5f),sz*(m-w/2.0f+.5f),sze,sze);
      popMatrix();
    }
    if (n==4){ //red
      pushMatrix();
      translate(0,0,w*sz/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0f+.5f),sz*(m-w/2.0f+.5f),sze,sze);
      popMatrix();
    }
    if (n==5){ //orange
      pushMatrix();
      translate(0,0,-w*sz/2);
      colored(block[l][m][n]);
      rect(sz*(l-v/2.0f+.5f),sz*(m-w/2.0f+.5f),sze,sze);
      popMatrix();
    }
  }
  }
  }
 
  rotation++;


  //println ("mousex:", mouseX, "\tmouseY:", mouseY);
}
public void keyPressed() {
rootate();
}

public void mousePressed(){

}
public void colored(int COLOR){
  if (COLOR==0){
    fill(0,100,255);
  }
  if (COLOR==1){
    fill(0,150,0);
  }
  if (COLOR==2){
    fill(200,200,0);
  }
  if (COLOR==3){
    fill(200);
  }
  if (COLOR==4){
    fill(255,0,0);
  }
  if (COLOR==5){
    fill(255,150,0);
  }
  if (COLOR==6){
    fill(150);
  }
}
public void rootate(){ 
    if(key == 'n'){
    restart();
  }
  
  if(key == 'r'){
    CW1();
  }
  if(key == 'R'){
    CCW1();
  }
  if(key == 'l'){
    CW0();
  }
  if(key == 'L'){
    CCW0();
  }

  if(key == 'u'){
    CW2();
  }
  if(key == 'U'){
    CCW2();
  }
  if(key == 'd'){
    CW3();
  }
  if(key == 'D'){
    CCW3();
  }
  if(key == 'f'){
    CW4();
  }
  if(key == 'F'){
    CCW4();
  
    }
    if(key == 'e'){
      E1CW();
    }
    if(key == 'E'){
      E1CCW();
    }
  }
public void restart(){
  for(int l=0; l<v; l++){
    for(int m=0; m<w; m++){
    for(int n=0; n<colors; n++){
    block[l][m][n]=n;
    }
    }
    }
}
float infoX, infoY, infoRectX, infoRectY;
PFont titleFont;

String pressD = "press d for row 3";
String pressR = "press r for column 3";
String pressN = "press n to restart";

String pressU = "press U for row 1";
String pressL = "press L for column 1";

public void textSomething(){
  infoX = 91;
  infoY = 10;
  infoRectX = 250;
  infoRectY = 300;
  
}

  public void textDraw(){
  titleFont = createFont("Italic", 48);
fill(0);

textAlign(CENTER, CENTER);
textFont(titleFont, 15);
text(pressD, infoX, infoY, infoRectX, infoRectY);

textAlign(CENTER, CENTER);
textFont(titleFont, 15);
text(pressR, 105, 27, 250, 300);

textAlign(CENTER, CENTER);
textFont(titleFont, 15);
text(pressN, 300, 550, 500, 500);

textAlign(CENTER, CENTER);
textFont(titleFont, 15);
text(pressU, 510, 10, 250, 300 );

textAlign(CENTER, CENTER);
textFont(titleFont, 15);
text(pressL, 490, 27, 250, 300 );

}
public void CW1(){//R
  for(int count=0; count<(w); count++){
    sub =                    block[0][count]    [2];
    block[0][count]    [2] = block[0][w-1-count][4];
    block[0][w-1-count][4] = block[0][w-1-count][3];
    block[0][w-1-count][3] = block[0][count]    [5];
    block[0][count]    [5] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[v-1]       [ecount]    [1];
    block[v-1]       [ecount]    [1] = block[v-1-ecount][w-1]       [1];
    block[v-1-ecount][w-1]       [1] = block[0]         [w-1-ecount][1];
    block[0]         [w-1-ecount][1] = block[ecount]    [0]         [1];
    block[ecount]    [0]         [1] = sub;
  }
}
public void CCW0(){//L'
  for(int count=0; count<(w); count++){
    sub =                      block[v-1][count]    [2];
    block[v-1][count]    [2] = block[v-1][w-1-count][4];
    block[v-1][w-1-count][4] = block[v-1][w-1-count][3];
    block[v-1][w-1-count][3] = block[v-1][count]    [5];
    block[v-1][count]    [5] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[v-1]       [ecount]    [0];
    block[v-1]       [ecount]    [0] = block[v-1-ecount][w-1]       [0];
    block[v-1-ecount][w-1]       [0] = block[0]         [w-1-ecount][0];
    block[0]         [w-1-ecount][0] = block[ecount]    [0]         [0];
    block[ecount]    [0]         [0] = sub;
  }
}
public void CCW1(){//R'
  for(int count=0; count<(w); count++){
    sub                    = block[0][count]    [5];
    block[0][count]    [5] = block[0][w-1-count][3];
    block[0][w-1-count][3] = block[0][w-1-count][4];
    block[0][w-1-count][4] = block[0][count]    [2];
    block[0][count]    [2] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[ecount]    [0]         [1];
    block[ecount]    [0]         [1] = block[0]         [w-1-ecount][1];
    block[0]         [w-1-ecount][1] = block[v-1-ecount][w-1]       [1];
    block[v-1-ecount][w-1]       [1] = block[v-1]       [ecount]    [1];
    block[v-1]       [ecount]    [1] = sub;
  }
}
public void CW0(){//L
  for(int count=0; count<(w); count++){
    sub                      = block[v-1][count]    [5];
    block[v-1][count]    [5] = block[v-1][w-1-count][3];
    block[v-1][w-1-count][3] = block[v-1][w-1-count][4];
    block[v-1][w-1-count][4] = block[v-1][count]    [2];
    block[v-1][count]    [2] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[ecount]    [0]         [0];
    block[ecount]    [0]         [0] = block[0]         [w-1-ecount][0];
    block[0]         [w-1-ecount][0] = block[v-1-ecount][w-1]       [0];
    block[v-1-ecount][w-1]       [0] = block[v-1]       [ecount]    [0];
    block[v-1]       [ecount]    [0] = sub;
  }
}
/*8*8*8*8*8*8*8*   *8*8*8*8*8*8*8*   *8*8*8*8*8*8*8*/
public void CW2(){//U
  for(int count=0; count<(v); count++){
    sub                      = block[count]    [w-1][0];
    block[count]    [w-1][0] = block[count]    [w-1][4];
    block[count]    [w-1][4] = block[v-1-count][w-1][1];
    block[v-1-count][w-1][1] = block[v-1-count][w-1][5];
    block[v-1-count][w-1][5] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[0]         [ecount]    [2];
    block[0]         [ecount]    [2] = block[v-1-ecount][0]         [2];
    block[v-1-ecount][0]         [2] = block[v-1]       [w-1-ecount][2];
    block[v-1]       [w-1-ecount][2] = block[ecount]    [w-1]       [2];
    block[ecount]    [w-1]       [2] = sub;
  }
}
public void CCW3(){//D'
  for(int count=0; count<(v); count++){
    sub                    = block[count]    [0][0];
    block[count]    [0][0] = block[count]    [0][4];
    block[count]    [0][4] = block[v-1-count][0][1];
    block[v-1-count][0][1] = block[v-1-count][0][5];
    block[v-1-count][0][5] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[0]         [ecount]    [3];
    block[0]         [ecount]    [3] = block[v-1-ecount][0]         [3];
    block[v-1-ecount][0]         [3] = block[v-1]       [w-1-ecount][3];
    block[v-1]       [w-1-ecount][3] = block[ecount]    [w-1]       [3];
    block[ecount]    [w-1]       [3] = sub;
  }
}
public void CCW2(){//U'
  for(int count=0; count<(v); count++){
    sub                      = block[v-1-count][w-1][5];
    block[v-1-count][w-1][5] = block[v-1-count][w-1][1];
    block[v-1-count][w-1][1] = block[count]    [w-1][4];
    block[count]    [w-1][4] = block[count]    [w-1][0];
    block[count]    [w-1][0] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[ecount]    [w-1]       [2];
    block[ecount]    [w-1]       [2] = block[v-1]       [w-1-ecount][2];
    block[v-1]       [w-1-ecount][2] = block[v-1-ecount][0]         [2];
    block[v-1-ecount][0]         [2] = block[0]         [ecount]    [2];
    block[0]         [ecount]    [2] = sub;
  }
}
public void CW3(){//D
  for(int count=0; count<(v); count++){
    sub                    = block[v-1-count][0][5];
    block[v-1-count][0][5] = block[v-1-count][0][1];
    block[v-1-count][0][1] = block[count]    [0][4];
    block[count]    [0][4] = block[count]    [0][0];
    block[count]    [0][0] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[ecount]    [w-1]       [3];
    block[ecount]    [w-1]       [3] = block[v-1]       [w-1-ecount][3];
    block[v-1]       [w-1-ecount][3] = block[v-1-ecount][0]         [3];
    block[v-1-ecount][0]         [3] = block[0]         [ecount]    [3];
    block[0]         [ecount]    [3] = sub;
  }
}
/*8*8*8*8*8*8*8*   *8*8*8*8*8*8*8*   *8*8*8*8*8*8*8*/
public void CW4(){//F
  for(int count=0; count<(v); count++){
    sub                            = block[0]        [count]    [0];
    block[0]        [count]    [0] = block[count]    [w-1]      [3];
    block[count]    [w-1]      [3] = block[0]        [w-1-count][1];
    block[0]        [w-1-count][1] = block[v-1-count][w-1]      [2];
    block[v-1-count][w-1]      [2] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[0]         [ecount]    [4];
    block[0]         [ecount]    [4] = block[ecount]    [w-1]       [4];
    block[ecount]    [w-1]       [4] = block[v-1]       [w-1-ecount][4];
    block[v-1]       [w-1-ecount][4] = block[v-1-ecount][0]         [4];
    block[v-1-ecount][0]         [4] = sub;
  }
}
public void CCW5(){//B'
  for(int count=0; count<(v); count++){
    sub                            = block[v-1]      [count]    [0];
    block[v-1]      [count]    [0] = block[count]    [0]        [3];
    block[count]    [0]        [3] = block[v-1]      [w-1-count][1];
    block[v-1]      [w-1-count][1] = block[v-1-count][0]        [2];
    block[v-1-count][0]        [2] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[0]         [ecount]    [5];
    block[0]         [ecount]    [5] = block[ecount]    [w-1]       [5];
    block[ecount]    [w-1]       [5] = block[v-1]       [w-1-ecount][5];
    block[v-1]       [w-1-ecount][5] = block[v-1-ecount][0]         [5];
    block[v-1-ecount][0]         [5] = sub;
  }
}
public void CCW4(){//F'
  for(int count=0; count<(v); count++){
    sub                            = block[v-1-count][w-1]      [2];
    block[v-1-count][w-1]      [2] = block[0]        [w-1-count][1];
    block[0]        [w-1-count][1] = block[count]    [w-1]      [3];
    block[count]    [w-1]      [3] = block[0]        [count]    [0];
    block[0]        [count]    [0] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[v-1-ecount][0]         [4];
    block[v-1-ecount][0]         [4] = block[v-1]       [w-1-ecount][4];
    block[v-1]       [w-1-ecount][4] = block[ecount]    [w-1]       [4];
    block[ecount]    [w-1]       [4] = block[0]         [ecount]    [4];
    block[0]         [ecount]    [4] = sub;
  }
}
public void CW5(){//B
  for(int count=0; count<(v); count++){
    sub                            = block[v-1-count][0]        [2];
    block[v-1-count][0]        [2] = block[v-1]      [w-1-count][1];
    block[v-1]      [w-1-count][1] = block[count]    [0]        [3];
    block[count]    [0]        [3] = block[v-1]      [count]    [0];
    block[v-1]      [count]    [0] = sub;
  }
  //corners
  for(int ecount=0; ecount<w-1; ecount++){
    sub                              = block[v-1-ecount][0]         [5];
    block[v-1-ecount][0]         [5] = block[v-1]       [w-1-ecount][5];
    block[v-1]       [w-1-ecount][5] = block[ecount]    [w-1]       [5];
    block[ecount]    [w-1]       [5] = block[0]         [ecount]    [5];
    block[0]         [ecount]    [5] = sub;
  }
}

 public void M1CW(){
    for(int count=0; count<(w); count++){
      sub =                    block[1][count]    [2];
      block[1][count]    [2] = block[1][w-1-count][4];
      block[1][w-1-count][4] = block[1][w-1-count][3];
      block[1][w-1-count][3] = block[1][count]    [5];
      block[1][count]    [5] = sub;
    }
  }
  
  public void M1CCW(){
    for(int count=0; count<(w); count++){
      sub                    = block[0][count]    [5];
      block[0][count]    [5] = block[0][w-1-count][3];
      block[0][w-1-count][3] = block[0][w-1-count][4];
      block[0][w-1-count][4] = block[0][count]    [2];
      block[0][count]    [2] = sub;
    }
  }
  public void E1CW(){
    for(int count=0; count<(v); count++){
      sub                      = block[count]    [w-2][0];
      block[count]    [w-2][0] = block[count]    [w-2][4];
      block[count]    [w-2][4] = block[v-1-count][w-2][1];
      block[v-1-count][w-2][1] = block[v-1-count][w-2][5];
      block[v-1-count][w-2][5] = sub;
    }
  }
  public void E1CCW(){
    for(int count=0; count<(v); count++){
      sub                      = block[v-1-count][w-2][5];
      block[v-1-count][w-2][5] = block[v-1-count][w-2][1];
      block[v-1-count][w-2][1] = block[count]    [w-2][4];
      block[count]    [w-2][4] = block[count]    [w-2][0];
      block[count]    [w-2][0] = sub;
    }
  }
  public void S1CW(){
    for(int count=0; count<(v); count++){
      sub                            = block[1]        [count]    [0];
      block[1]        [count]    [0] = block[count]    [w-2]      [3];
      block[count]    [w-2]      [3] = block[1]        [w-1-count][1];
      block[1]        [w-1-count][1] = block[v-1-count][w-2]      [2];
      block[v-1-count][w-2]      [2] = sub;
    }
  }
  public void S1CCW(){
    for(int count=0; count<(v); count++){
      sub                            = block[v-1-count][w-2]      [2];
      block[v-1-count][w-2]      [2] = block[1]        [w-1-count][1];
      block[1]        [w-1-count][1] = block[count]    [w-2]      [3];
      block[count]    [w-2]      [3] = block[1]        [count]    [0];
      block[1]        [count]    [0] = sub;
    }
  }
  public void settings() {  size(600,600,P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "im_done" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
