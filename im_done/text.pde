float infoX, infoY, infoRectX, infoRectY;
PFont titleFont;

String pressD = "press d for row 3";
String pressR = "press r for column 3";
String pressN = "press n to restart";

String pressU = "press U for row 1";
String pressL = "press L for column 1";

void textSomething(){
  infoX = 91;
  infoY = 10;
  infoRectX = 250;
  infoRectY = 300;
  
}

  void textDraw(){
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
