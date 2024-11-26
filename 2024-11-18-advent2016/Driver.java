import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

/*
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
*/

/* Day 3 Part 1
 public class Driver {
   public static int parse(String file){
     
     int total = 0;
     try{
       Scanner inf = new Scanner(new File(file));
       while(inf.hasNext()) {
        int s1 = inf.nextInt();
        int s2 = inf.nextInt();
        int s3 = inf.nextInt();
        if (
          ((s1 + s2) > s3) &&
          ((s2 + s3) > s1) &&
          ((s3 + s1) > s2)
        ) {
          System.out.println(total);
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);
          total ++;
        }
        inf.nextLine();
       }
     }catch (Exception e){
       System.exit(1);
     }
     System.out.println(total);
     return total;
   }


   public static void main(String[] args) {
     System.out.println(parse("input.txt"));
   }
 }
*/

/* Day 3 Part 2
public class Driver {
   public static int parse(String file){
     int total = 0;
     
     try{
      ArrayList<Integer> data = new ArrayList<Integer>();

       Scanner inf = new Scanner(new File(file));
       while(inf.hasNextLine()) {
        while (inf.hasNext()){
          data.add(inf.nextInt());
        }
        inf.nextLine();
       }

       inf.close();
       System.out.println(data.toString());
       System.out.println(data.size());
       for (int i = 0; i < data.size() - 6; i++){
        
        if (i % 3 == 0 && i != 0){
          i = i + 6;
        }
        
        int s1 = data.get(i);
        System.out.println(s1);

        int s2 = data.get(i+3);

        System.out.println(s2);

        int s3 = data.get(i+6);

        System.out.println(s3);
        if (((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s3 + s1) > s2)) {
          total ++;
        }else {
          System.out.println("Not Triangle!");
        }

        

       }


     }catch (Exception e){
       System.exit(1);
     }
     return total;
   }


   public static void main(String[] args) {
     System.out.println(parse("input.txt"));
   }
 }

*/

// Day 2 Part 1
public class Driver {
   public static String parse(String file){
     String answer = "";

     try{
       Scanner inf = new Scanner(new File(file));
       
       while(inf.hasNextLine()) {
        int pos = 5;

        System.out.println(pos);
            
        String directions = inf.next();
        
        for (int i = 0; i <directions.length(); i++){
          char direction = directions.charAt(i);

          if (direction == 'L'){
            if (pos != 1 && pos != 4 && pos != 7){
              pos --;
            } 

          }else if (direction == 'R'){
            if (pos != 3 && pos != 6 && pos != 9){
              pos ++;
            } 


          }else if (direction == 'D'){
            if (pos != 7 && pos != 8 && pos != 9){
              pos += 3;
            } 


          }else if (direction == 'U'){
            if (pos != 1 && pos != 2 && pos != 3){
              pos -= 3;
            } 
          }


        }

        

        System.out.println(pos);
        answer += pos;
        inf.nextLine();
       }



     }catch (Exception e){
       System.exit(1);
     }
     return answer;
   }


   public static void main(String[] args) {
     System.out.println(parse("input.txt"));
   }
 }
