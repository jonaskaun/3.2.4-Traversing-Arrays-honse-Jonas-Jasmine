/*
 * Activity 3.1.4
 */
public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
    Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
    new Player("Bobbie", 18), new Player("Blaine", 20),
    new Player("Chris", 15), new Player("Charlie", 15)};
    
    int sum = 0;
    for (int i = 0; i < goals.length; i++)
      //record each goal to a single sum int
      sum += goals[i];
    System.out.println("All goals: " + sum);
    // print average goals per game, no rounding
    double averageGoals = (sum)/((1.0)*(goals.length)); 
    System.out.println("Average goals: "+ averageGoals);


    // finding the max value
    int max = 0;
    for(int goal: goals){
      if (goal>max){
        max = goal;
      }
    }
    System.out.println("The max goal amount was: "+max);
  

    // finding a player 18 or older
    String oldPlayer = "";
    boolean hasValue = false;

    int t = 0;
    while(hasValue == false){
      
      if (players[t].getAge()>= 18){
        oldPlayer = players[t].getName();
        hasValue = true;
      }
      t++;
    }

    System.out.println(oldPlayer +" is 18 or older");


    System.out.println("the players are: ");
    t= 0;
    for(Player p: players){
      System.out.print(p.getName());

      if( t%2 == 0){
        System.out.print(" and ");
      }
      else{
        System.out.println("");
      }
      t++;
    }

    int[] cookingLevel = {6,7,67,21,8,9};
    System.out.println("\n\n\n\nchat are we cooked???: ");
    
    
    for(int sixSeven: cookingLevel){
      System.out.print(sixSeven+", ");
    }
    int tempRot;
    System.out.println("\n");
    for(t=0;t<cookingLevel.length-1;t++){
      tempRot = cookingLevel[t];
      cookingLevel[t] = cookingLevel[t+1];
      cookingLevel[t+1] = tempRot;
    }
    for(int sixSeven: cookingLevel){
      System.out.print(sixSeven+", ");
    }
    System.out.println("\n\n\n\n\n");
    String rotTemp ="";
    String[] brainRot = {"tun tun tun sahur","assassino capuchino","bombini goosini","girraffe","frullili fruilla","glorbo"};
    for(t=brainRot.length;t>0;t--){
      System.out.print(brainRot[t-1]+" ; ");
    }
    System.out.println("\n\n\nchanged\n\n");
    
    for(t=brainRot.length-1;t>1;t--){
      
      rotTemp = brainRot[t-1];
      brainRot[t-1] = brainRot[t];
      brainRot[t] = rotTemp;
      System.out.print(brainRot[t-1]+" ; ");
    }
    int numbersTemp;
    System.out.print("\n\n\n reverse order \n\n\n");
    int[] Numbers = {1,2,3,4,5,6,7,8,9,10,11};
    for(int num:Numbers){
      System.out.print(num+",");
    }
    System.out.print("\n");
    for(t=0;t<Numbers.length/2;t++){
      numbersTemp = Numbers[t];
      Numbers[t] = Numbers[((Numbers.length)-1)-t];
      Numbers[((Numbers.length)-1)-t] = numbersTemp;
    }
    for(int num:Numbers){
      System.out.print(num+",");
    }

    System.out.print("\n\nrandom permutations\n\n");

    int[] p = {1,3,5,7,9,11,2,4,6,8,10};
    int[] r = new int[11];
    int increment = 0;
    int decrement = p.length;
    for(int pTest:p){
      System.out.print(pTest+" : ");
    }
    int randomInt;
    for(int pan:p){
      randomInt = (int)(Math.random()*decrement);
      int pTemp = p[randomInt];
      r[increment] = pTemp;
      p[randomInt] = p[p.length-1];
      increment ++;
      decrement --;
    }
    System.out.println("");
    for(int ran:r){
      System.out.print(ran+" : ");
    }





    
    

  }
    
}

