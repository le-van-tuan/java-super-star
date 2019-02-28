package vn.sps.oops.inheritence;

public class Application {
    public static void main(String[] args) {
        /**
        * As you see, Dog class have not bark method, but it still call bark as usual.
         * Why? Be cause Dog class has extends Animal class which has bark method
         * So, Dog class can call everything is supper class with access modifier = public, protected and default
        * */
        Dog dog = new Dog();
        dog.bark();
    }
}
