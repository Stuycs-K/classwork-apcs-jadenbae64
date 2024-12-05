public class Driver{
    public static void main (String[]args){
        for (int i = 0; i < 30; i++){
            Text.color(Text.background(Text.YELLOW));
            if (i == 0 || i == 29){
                System.out.println("                                                                                ");
            }else{
               System.out.println(" ");
               System.out.print(Text.RESET);
               System.out.print("                                                                              ");
               Text.color(Text.background(Text.YELLOW));
               System.out.print(" "); 
            }
            
        }
        System.out.print(Text.RESET);
    }
    
}