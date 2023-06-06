import java.util.*;

public class weeklyhours {
    public static void main(String[] args) {
        // Create a HashMap to store the weekly hours for each employee
        HashMap<String, Integer> weeklyHours = new HashMap<>();


        weeklyHours.put("Employee0", 2 + 4 + 3 + 4 + 5 + 8 + 8);
        weeklyHours.put("Employee1", 7 + 3 + 4 + 3 + 3 + 4 + 4);
        weeklyHours.put("Employee2", 3 + 3 + 4 + 3 + 3 + 2 + 2);
        weeklyHours.put("Employee3", 9 + 3 + 4 + 7 + 3 + 4 + 1);
        weeklyHours.put("Employee4", 3 + 5 + 4 + 3 + 6 + 3 + 8);
        weeklyHours.put("Employee5", 3 + 4 + 4 + 6 + 3 + 4 + 4);
        weeklyHours.put("Employee6", 3 + 7 + 4 + 8 + 3 + 8 + 4);
        weeklyHours.put("Employee7", 6 + 3 + 5 + 9 + 2 + 7 + 9);
        // Create a list of Map Entries to sort the employees by their total hours
        List<Map.Entry<String, Integer>> employeeList = new ArrayList<>(weeklyHours.entrySet());

        // Sort the list based on the total hours worked
        Collections.sort(employeeList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        // Display the employees in ascending order of total hours worked
        System.out.println("Employees sorted by total hours worked:");

        for (Map.Entry<String, Integer> entry : employeeList) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " hours");
        }
    }
}
