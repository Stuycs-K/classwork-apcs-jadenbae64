import java.util.Scanner;
import java.util.ArrayList;


 public class Driver {
   public static void main(String[] args) {
     int direction = 1; //1 : y, 2 : x, 3: -y, 4: -x
     int currentX = 0;
     int currentY = 0;

     Scanner sc1 = new Scanner("input.txt");

     while(sc2.hasNext(", ")) {
       if (next() == "R"){
         direction ++;
       }else{
         direction --;
       }

       if (direction == 5){
         direction = 1;
       }else if(direction == 0){
         direction = 4
       }

       if (direction == 1){
         currentY += next();
       }else if (direction == 2){
         currentX += next();
       }else if (direction == 3){
         currentY -= next();
       }else if (direction == 4){
         currentX -= next();
       }
       
     }
     System.out.println(cu);
     System.out.println(TriangleTester.countTrianglesA("inputTri.txt"));
   }
 }
