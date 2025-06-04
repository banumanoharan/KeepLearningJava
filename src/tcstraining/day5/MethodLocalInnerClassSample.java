package tcstraining.day5;

public class MethodLocalInnerClassSample {
    public static void main(String[] args) {
        new Outer11().outerMethod11();
    }
}
class Outer11 {
    void outerMethod11()
    {
        System.out.println("inside outerMethod");
        class Inner11 {
            void innerMethod()
            {
                System.out.println("inside innerMethod");
            }
        }
        Inner11 y = new Inner11();

        y.innerMethod();
    }
}

