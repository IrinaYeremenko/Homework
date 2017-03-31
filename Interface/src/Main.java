/**
 * Created by UITSchoolHP-20 on 3/31/2017.
 */
public class Main {
    public static void main(String[] args) {
        FirstClass instansOfClass = new FirstClass();
        instansOfClass.setField(new Interface() {
            @Override
            public void fooBar() {
                 System.out.println("Hello World!");
            }
        });
        System.out.println("How are you?");
        instansOfClass.callInterfaceMethod();
    }
}
