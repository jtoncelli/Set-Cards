import java.util.*;
class SetCard{
  private int shape;
  private String strshape;
  private int shading;
  private String strshading;
  private int number;
  private int color;
  private String strcolor;

public SetCard(int s, int sh, int n, int c){
  shape = s;
  if (shape == 0){
    strshape = "wavy";
  }
  if (shape == 1){
    strshape = "diamond";
  }
  if (shape == 2){
    strshape = "oval";
  }
  shading = sh;
  if (shading == 0){
    strshading = "full";
  }
  if (shading == 1){
    strshading = "stripes";
  }
  if (shading == 2){
    strshading = "empty";
  }
  number = n+1;
  color = c;
  if (color == 0){
    strcolor = "purple";
  }
  if (color == 1){
    strcolor = "red";
  }
  if (color == 2){
    strcolor = "green";
  }
}
void printCard(){
  System.out.println(number + " " +color + " " + shading + " " + shape );
}
int getShape(){
  return shape;
}
int getShading(){
  return shading;
}
int getNumber(){
  return number;
}
int getColor(){
  return color;
}
}
