package ExceptionHierrachy;

import java.io.FileNotFoundException;

public class ChildClass extends ParentClass{
    @Override
    public void method1() {
        System.out.println("1. Child class - no exception check");
    }

    /**
     * Compile time error - overridden method does not throw 'java.io.FileNotFoundException'
     * @throws FileNotFoundException
     */
//    @Override
//    public void method2() throws FileNotFoundException {
//        super.method2("2. Child class - Checked Exception thrown");
//    }

    @Override
    public void method3() throws ArrayIndexOutOfBoundsException {
        System.out.println("3. Child class - Unchecked exception thrown");
    }

    @Override
    public void method4() {
        System.out.println("4. Child class - no exception check");
    }

    @Override
    public void method5() throws FileNotFoundException {
        System.out.println("5. Child class - Checked Exception thrown SAME/DERIEVED type");
    }

    /**
     * COMPILATION ERROR - overridden method does not throw 'java.lang.ClassNotFoundException'
     * @throws ClassNotFoundException
     */
//    @Override
//    public void method6() throws ClassNotFoundException {
//        System.out.println("6. Child class - Checked Exception thrown DIFFERENT type");
//    }

    @Override
    public void method7() throws ArrayIndexOutOfBoundsException {
        System.out.println("7. Child class - Un-Checked Exception thrown");
    }

    @Override
    public void method8() throws IndexOutOfBoundsException {
        System.out.println("8. Child class - no exception check");
    }

    /**
     * Comiple time error - overridden method does not throw 'java.io.FileNotFoundException'
     * @throws FileNotFoundException
     */
//    @Override
//    public void method9() throws FileNotFoundException {
//        System.out.println("9. Child class - Un-Checked Exception thrown");
//    }

    @Override
    public void method10() throws ArrayIndexOutOfBoundsException {
        System.out.println("10. Child class - Un-Checked Exception thrown SAME/DERIEVED type");
    }

    @Override
    public void method11() throws NullPointerException {
        System.out.println("11. Child class - Un-Checked Exception thrown DIFFERENT type");
    }
}
