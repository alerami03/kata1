
package katav1;

import java.util.Date;

public class Katav1 {

   
    public static void main(String[] args) {
        
        Person person = new Person("pepe", "chiron", new Date(58,6,3));
        System.out.println(person.getName()+ " " + person.getSurname() + " tiene " + person.getAge() + " tacos");
    }
}
