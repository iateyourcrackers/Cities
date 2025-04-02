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
        
        // Prints all keys
        for (String i : capCities.keySet()) {
            System.out.println(i);
        }
        
        // Prints all values
        for (String i : capCities.values()) {
            System.out.println(i);
        }
        
        // Loop through hashmap and print all countries that contains the letter 'A'
        for (String i : capCities.keySet()) {
            System.out.println("Key: " + i + ", Value: " + capCities.get(i));
            if (i.toLowerCase().contains("a")) {
                System.out.println("Country: " + i + ", Capital: " + capCities.get(i));
            }
        }
    }
}
