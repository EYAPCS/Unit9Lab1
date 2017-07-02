/**
 * Created by emma on 6/27/17.
 */

/**
 * The Date object models a month, day, year date.
 * @author Emma Yang
 */

public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int day, int month, int year) {

        setDay(day);
        setMonth(month);
        setYear(year);

    }

    public Date() {

        setDay(9);
        setMonth(99);
        setYear(9999);

    }

    public int getMonth() {

        return month;

    }

    public int getDay() {

        return day;

    }

    public int getYear() {

        return year;

    }

    public void setMonth(int newMonth) {

        month = newMonth;

    }

    public void setDay(int newDay) {

        day = newDay;

    }

    public void setYear(int newYear) {

        year = newYear;

    }

    public String toString() {

        return String.format("%02d/%02d/%02d", getMonth(), getDay(), getYear()); //Formats into mm/dd/yy format

    }

}