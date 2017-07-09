/**
 * Created by emma on 6/27/17.
 */

/**
 * TestPerson tests the Person object
 * @author Emma Yang
 */

public class TestPerson {

    public static void main(String[] args) {

        Person aPerson = new Person("Tony", "Baggadonuts", new Date(21, 10, 2001));

        System.out.println("My name is " + aPerson.getName());
        System.out.println("I was born on " + aPerson.getBirthDayString());


    }

}
