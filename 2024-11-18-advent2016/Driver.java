import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

 public class Driver {
   public static int solve (String[] data){
     int x = 0;
     int y = 0;
     int facing = 0;

     int [][] offset =  {{0,1},{1,0},{0,-1},{-1,0}};

     for (int i = 0; i < data.length; i++){
       String dir = data[i].substring(0,1);
       int dist = Integer.parseInt(data[i].substring(1));

       if (dir.equals("L")){
         facing = (facing + 4 - 1) % 4;
       }else{
         facing = (facing + 4 + 1) % 4;
       }

       x = x + offset[facing][0] * dist;
       y = y + offset[facing][1] * dist;
     }

     System.out.println(x);
     System.out.println(y);

     return (Math.abs(x) + Math.abs(y));
   }
   public static String [] parse(String file){
     try{
       Scanner inf = new Scanner(new File(file));
       String line = inf.nextLine();
       System.out.println((Arrays.toString(line.split(", "))));
       return (line.split(", "));
       
     }catch (Exception e){
       System.exit(1);
     }
     return null;
   }


   public static void main(String[] args) {
     System.out.println(solve(parse("input.txt")));
   }
 }
