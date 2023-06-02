public class Main {
 public static void main(String[] args){
     car my_car = new car();
     System.out.println("===============================");
     System.out.println("make: " +my_car.make);
     System.out.println("Model: " + my_car.model);
     System.out.println("Prince: " + my_car.prince);
     System.out.println("Year: "  +my_car.year);
     my_car.drive();
     my_car.Drive_with_Girlfriend();
     System.out.println("===============================");
     car mom_Car = new car();
     System.out.println("My mom make: " + mom_Car.make);
     System.out.println("My mom Model: " + mom_Car.model);
     System.out.println("My mom Prince: " + mom_Car.prince);
     System.out.println("My mom Car year: " + mom_Car.year);
     mom_Car.brake();
     System.out.println("===============================");
     Book my_book = new Book();

     System.out.println("Author: " + my_book.author);
     System.out.println("Tittle: " + my_book.title);
 }
}