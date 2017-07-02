/**
 * Created by emma on 6/27/17.
 */

/**
 * TestPerson tests the Person object
 * @author Emma Yang
 */

public class TestPerson {

    public static void main(String[] args) {

        Person a = new Person("Tony", "Baggadonuts", new Date(21, 10, 2001));

        System.out.println("My name is " + a.getFullName());
        System.out.println("I was born on " + a.getBirthDayString());


    }

}
