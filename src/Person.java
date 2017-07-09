/**
 * Created by emma on 6/27/17.
 */

/**
 * The Person class has the attributes firstName, lastName, and birthDay.
 * @author Emma
 */

public class Person
{
    private Name name;
    private Date birthDay;


    public String getBirthDayString()
    {
        return birthDay.toString();
    }

    public String getName() {
        return name.getName();
    }

    public void setBirthDay(int day, int month, int year) {
        birthDay = new Date(day, month, year);
    }

    public void setName(String fn, String ln) {
        name = new Name(fn, ln);
    }

    /**
     * The Person constructor sets sets the name and birthDay
     * @param fn
     * @param ln
     * @param bd
     */

    public Person( String fn, String ln, Date bd )
    {
        name = new Name(fn, ln);
        birthDay = bd;
    }

    /**
     * By default, a person's name and birthday is set to none and 99/99/9999 respectively
     */

    public Person() // Default constructor
    {
        name = new Name();
        birthDay = new Date();
    }

}
