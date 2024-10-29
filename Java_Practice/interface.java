package Java_Practice;
interface Animal {
    public void animalSound();
    //interface method (does not have a body)
    public void run();
}

// when you impliment an interface you should give body to the methods in the implemented class
class Dog implements Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    public void run() {
        System.out.println("The dog is running");
    }
    // if I don't give body to the methods in the implemented class then it will give an error
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.run();
    }
}