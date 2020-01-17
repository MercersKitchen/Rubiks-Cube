void restart(){
  for(int l=0; l<v; l++){
    for(int m=0; m<w; m++){
    for(int n=0; n<colors; n++){
    block[l][m][n]=n;
    }
    }
    }
}
