public class Game{
  public static void main(String[]args){
    CodeWarrior codeWarrior1 = new CodeWarrior();
    Adventurer adventurer1 = new Adventurer();

    System.out.println(codeWarrior1.getName()+", "+codeWarrior1.getHP()+", "+codeWarrior1.getSpecialName()+", "+codeWarrior1.getSpecial());
    System.out.println(adventurer1.getName()+", "+adventurer1.getHP());

    while (true){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String nextMove = userInput.nextLine();

      if (nextMove.Equals("a")) {

      }else if (nextMove.Equals("sp")){


      }else if (nextMove.Equals("su")){


      }else if (nextMove.Equals("quit")){
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
