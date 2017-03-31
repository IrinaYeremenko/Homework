/**
 * Created by UITSchoolHP-20 on 3/31/2017.
 */
public class FirstClass {
    Interface field;

    void setField(Interface field) {
        this.field = field;
    }

    void callInterfaceMethod() {
        field.fooBar();
    }
}
