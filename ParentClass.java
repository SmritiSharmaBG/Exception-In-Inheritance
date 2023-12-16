package ExceptionHierrachy;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ParentClass {

    // PARENT - NO EXCEPTION
    public void method1() {
        System.out.println("1. Parent class - no exception check");
    }

    public void method2() {
        System.out.println("2. Parent class - no exception check");
    }

    public void method3() {
        System.out.println("3. Parent class - no exception check");
    }


    // PARENT - CHECKED EXCEPTION
    public void method4() throws FileNotFoundException {
        System.out.println("4. Parent class - Checked Exception thrown");
    }

    public void method5() throws IOException {
        System.out.println("5. Parent class - Checked Exception thrown");
    }

    public void method6() throws IOException {
        System.out.println("6. Parent class - Checked Exception thrown");
    }

    public void method7() throws IOException {
        System.out.println("7. Parent class - Checked Exception thrown");
    }


    // PARENT - UNCHECKED EXCEPTION
    public void method8() throws IndexOutOfBoundsException {
        System.out.println("8. Parent class - Un-Checked Exception thrown");
    }

    public void method9() throws IndexOutOfBoundsException {
        System.out.println("9. Parent class - Un-Checked Exception thrown");
    }

    public void method10() throws IndexOutOfBoundsException {
        System.out.println("10. Parent class - Un-Checked Exception thrown");
    }

    public void method11() throws IndexOutOfBoundsException {
        System.out.println("11. Parent class - Un-Checked Exception thrown");
    }
}
