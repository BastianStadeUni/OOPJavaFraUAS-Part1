
class Animal implements Cloneable{
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
    protected Object clone() throws CloneNotSupportedException {
    	return super.clone();
    }
}

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
        
        Animal clone = (Cat)myAnimal.clone();
        System.out.println("Is clone and myAnimal equal? "+ clone.equals(myAnimal));
        System.out.println("Is myCat and myAnimal equal? "+ myCat.equals(myAnimal));
        System.out.println("Class of myAnimal: "+myAnimal.getClass());
        System.out.println("Class of clone: "+clone.getClass());
        System.out.println("Hashcode of myAnimal: "+myAnimal.hashCode());
        System.out.println("Is clone and myAnimal equal? "+ clone.equals(myAnimal));
        System.out.println("String of myAnimal: "+myAnimal.toString());
    }
}