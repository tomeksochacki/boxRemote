public class OverloadDemo {
    void test() {
    System.out.println("Parameterless");
    }

    void test(int a){
        System.out.println("Parameter a is: " + a);
    }

    void test(int a, int b){
        System.out.println("Parameter a and b are:" + a + " " + b);
    }

    void test(double a){
        System.out.println("Parameter a is: " + a);
    }
}
