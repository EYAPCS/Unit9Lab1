/**
 * Created by emma on 6/27/17.
 */
public class Name {

    private String first;
    private String last;

    public Name(String myFirst, String myLast) {
        setFirst(myFirst);
        setLast(myLast);
    }

    /**
     * By default, name is set to None.
     */

    public Name() {

        setFirst("None");
        setLast("None");

    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setFirst(String fn) {
        first = fn;
    }

    public void setLast(String ln) {
        last = ln;
    }

    public String getName() {
        return getFirst() + " " + getLast();
    }

}
