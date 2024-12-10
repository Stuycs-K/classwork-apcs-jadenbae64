import java.util.Scanner;

public class Game{
  public static void main(String[]args){
    CodeWarrior codeWarrior1 = new CodeWarrior();
    Adventurer adventurer1 = new Warrior("Beowulf");

    System.out.println(codeWarrior1.getName()+", "+codeWarrior1.getHP()+", "+codeWarrior1.getSpecialName()+", "+codeWarrior1.getSpecial());
    System.out.println(adventurer1.getName()+", "+adventurer1.getHP()+", "+adventurer1.getSpecialName()+", "+adventurer1.getSpecial());

    Scanner userInput = new Scanner(System.in);

    while (true){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String nextMove = userInput.nextLine();

      if (nextMove.equals("a")) {

      }else if (nextMove.equals("sp")){


      }else if (nextMove.equals("su")){


      }else if (nextMove.equals("quit")){
        break;

      }else{
        System.out.println("Please type valid response!");
      }




      if (codeWarrior1.getHP() <= 0 || adventurer1.getHP() <= 0){

        break;
      }
    }


  }
}
