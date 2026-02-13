
import java.util.ArrayList;

/*
 * Activity 3.2.4
 */
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    HorseBarn barn = new HorseBarn();

    ArrayList<Horse> barnSpaces = new ArrayList<Horse>(barn.getSpaces());

    for (Horse h : barnSpaces)
    {
      System.out.println(h);
    }

    int numSpaces = barnSpaces.size();
    for (int i = 0; i < numSpaces; i++)
      {
        Horse h = barnSpaces.get(i);
        if (h.getName().equals("Patches"))
        {
          System.out.println("Bye bye " +  barnSpaces.remove(i));
        }
      }
  }
} 