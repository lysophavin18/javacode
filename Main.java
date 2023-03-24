import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();

        number.add(1); // list start from index 0
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5); // add list

        number.remove(Integer.valueOf(4));  //remove list
        number.set(2, Integer.valueOf(30)); //Update list
        number.clear(); // clear all list
        System.out.println(number);
    }
}