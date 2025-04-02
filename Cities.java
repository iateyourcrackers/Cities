import java.util.HashMap; // import the HashMap class

/**
 * Write a description of class Cities here.
 * Practice hashmaps
 *
 * @author (Hao Jessica Fu)
 * @version (3/4/25)
 */
public class Cities
{
    // instance variables
    

    /**
     * Constructor for objects of class Cities
     */
    public Cities()
    {
        // initialise instance variables
        
    }
    
    public static void main(String[] args) {
        // create bject called capCities of the hashmap class (dict)
        HashMap<String, String> capCities = new HashMap<String, String>();
        
        // Add keys and values (countries and capCities)
        capCities.put("New Zealand", "Wellington");
        capCities.put("Australia", "Canberra");
        capCities.put("Germany", "Berlin");
        capCities.put("Norway", "Oslo");
        capCities.put("USA", "Washington DC");
        
        
        System.out.println(capCities); // print all keys & values in the hashmap
        System.out.println(capCities.get("New Zealand")); // print the passed in key's value
        
        // remove keys
        capCities.remove("USA");
        System.out.println(capCities);
        
        // check the hashmap size
        System.out.println(capCities.size());
    }
}
