
import java.util.ArrayList;

/*
 * Activity 3.2.4
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();
    RandomPermutation r = new RandomPermutation();

    ArrayList<Horse> barnSpaces = new ArrayList<Horse>(barn.getSpaces());

    for (Horse h : barnSpaces)
    {
      System.out.println(h);
      // if (h.getName().equals("Patches"))
      // barnSpaces.remove(h);
      // tries to change size of array while looping through array
    }

    int numSpaces = barnSpaces.size();
    // for (int i = 0; i < numSpaces; i++)
    //   {
    //     Horse h = barnSpaces.get(i);
    //     if (h.getName().equals("Lady"))
    //     {
    //       System.out.println("Bye bye " + barnSpaces.remove(i));  
    //       numSpaces = barnSpaces.size();
    //       i--;
    //     }
    //     if (h.getName().equals("Patches"))
    //     {
    //       System.out.println("Bye bye " +  barnSpaces.remove(i));
    //       numSpaces = barnSpaces.size();
    //     }
    //   }
    
    int i = 0;
    numSpaces = barnSpaces.size();
    while (i < numSpaces)
    {
      Horse h = barnSpaces.get(i);
      if (h.getName().equals("Lady"))
      {
        System.out.println("Bye bye " + barnSpaces.remove(i));  
        numSpaces = barnSpaces.size();
        i--;
      }
      else if (h.getName().equals("Patches"))
      {
        System.out.println("Bye bye " +  barnSpaces.remove(i));
        numSpaces = barnSpaces.size();
      }
      i++;
    }
    
    Horse princess = new Horse("Princess", 1445);
    Horse cheif = new Horse("Chief", 1505);
    Horse magic = new Horse("Magic", 1425);
    Horse gypsy = new Horse("Gypsy", 1335);

    i=0;
    numSpaces = barnSpaces.size();
    boolean stepTwo = false;
    boolean stepThree = false;
    boolean stepFour = false;
    while( i < numSpaces){
      if (((barnSpaces.get(i)).getName()).equals("Duke")&&(stepTwo == false)){
        barnSpaces.remove(i);
        barnSpaces.add(i, princess);
        System.out.println("replace Duke with Princess");
        i=0;
        stepTwo = true;
        
      }
      else if(((barnSpaces.get(i)).getName()).equals("Silver")&&(stepTwo == true)&&(stepThree == false)){
        barnSpaces.add(i+1,cheif);
        System.out.println("add Cheif after silver");
        i= 0;
        stepThree = true;

      }
      else if(((barnSpaces.get(i)).getName()).equals("Buddy")&&(stepThree == true)&&(stepFour == false)){
        barnSpaces.add(i, gypsy);
        barnSpaces.add(i+2,magic);
        System.out.println("buddy sandwich which gypsy and magic");
        stepFour = true;




      }


      numSpaces = barnSpaces.size();
      i++;

    }
    System.out.println("Full barn layout : " +barnSpaces+"\n");


    System.out.println("randomized barn layout : " + r.next(barnSpaces));

  }
} 