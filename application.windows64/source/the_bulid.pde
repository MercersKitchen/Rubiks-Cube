void CW1(){//R
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
void CCW0(){//L'
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
void CCW1(){//R'
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
void CW0(){//L
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
void CW2(){//U
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
void CCW3(){//D'
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
void CCW2(){//U'
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
void CW3(){//D
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
void CW4(){//F
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
void CCW5(){//B'
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
void CCW4(){//F'
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
void CW5(){//B
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

 void M1CW(){
    for(int count=0; count<(w); count++){
      sub =                    block[1][count]    [2];
      block[1][count]    [2] = block[1][w-1-count][4];
      block[1][w-1-count][4] = block[1][w-1-count][3];
      block[1][w-1-count][3] = block[1][count]    [5];
      block[1][count]    [5] = sub;
    }
  }
  
  void M1CCW(){
    for(int count=0; count<(w); count++){
      sub                    = block[0][count]    [5];
      block[0][count]    [5] = block[0][w-1-count][3];
      block[0][w-1-count][3] = block[0][w-1-count][4];
      block[0][w-1-count][4] = block[0][count]    [2];
      block[0][count]    [2] = sub;
    }
  }
  void E1CW(){
    for(int count=0; count<(v); count++){
      sub                      = block[count]    [w-2][0];
      block[count]    [w-2][0] = block[count]    [w-2][4];
      block[count]    [w-2][4] = block[v-1-count][w-2][1];
      block[v-1-count][w-2][1] = block[v-1-count][w-2][5];
      block[v-1-count][w-2][5] = sub;
    }
  }
  void E1CCW(){
    for(int count=0; count<(v); count++){
      sub                      = block[v-1-count][w-2][5];
      block[v-1-count][w-2][5] = block[v-1-count][w-2][1];
      block[v-1-count][w-2][1] = block[count]    [w-2][4];
      block[count]    [w-2][4] = block[count]    [w-2][0];
      block[count]    [w-2][0] = sub;
    }
  }
  void S1CW(){
    for(int count=0; count<(v); count++){
      sub                            = block[1]        [count]    [0];
      block[1]        [count]    [0] = block[count]    [w-2]      [3];
      block[count]    [w-2]      [3] = block[1]        [w-1-count][1];
      block[1]        [w-1-count][1] = block[v-1-count][w-2]      [2];
      block[v-1-count][w-2]      [2] = sub;
    }
  }
  void S1CCW(){
    for(int count=0; count<(v); count++){
      sub                            = block[v-1-count][w-2]      [2];
      block[v-1-count][w-2]      [2] = block[1]        [w-1-count][1];
      block[1]        [w-1-count][1] = block[count]    [w-2]      [3];
      block[count]    [w-2]      [3] = block[1]        [count]    [0];
      block[1]        [count]    [0] = sub;
    }
  }
