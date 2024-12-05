public class Driver{
    public static void main (String[]args){
        for (int i = 0; i < 30; i++){
            Text.color(Text.background(Text.YELLOW));
            if (i == 0 || i == 29){
                System.out.print("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                System.out.println(Text.RESET); 
            
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