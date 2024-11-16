package Java_Practice;

class Abc{
    static Abc obj = new Abc();

    private Abc() {

    }
    public static Abc getInstance() {
        return obj;
    }
}

// static key word is used to create a single instance of a class and it is shared among all the objects of the class.