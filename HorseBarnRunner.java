
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
  }
} 