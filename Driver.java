public class Driver{
    public static int rng(){
        return((int)(Math.random() * 100));
    }
    public static void main (String[]args){
        for (int i = 0; i < 30; i++){
            Text.color(Text.background(Text.YELLOW));
            if (i == 0 || i == 29){
                System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                System.out.println(Text.RESET); 
            /*
            }else if(i == 1){

                int[] randomNumb = {rng(), rng(), rng()};

                for (i = 0; i < 70; i++){
                    if (randomNumb[i%3] < 25){
                        Text.color(Text.background(Text.RED));
                    }else if(randomNumb[i%3] > 75){
                        Text.color(Text.background(Text.GREEN));
                    }else{
                        System.out.print(Text.RESET); 
                    }

                    System.out.print(randomNumb[i%3]);    

                }

                System.out.println(Text.RESET); 
            */
            }else{
               System.out.print("b");
               System.out.print(Text.RESET);
               System.out.print("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
               Text.color(Text.background(Text.YELLOW));
               System.out.print("b");
               System.out.println(Text.RESET); 
               
            }
            
            
        }
        System.out.print(Text.RESET);
    }
    
}