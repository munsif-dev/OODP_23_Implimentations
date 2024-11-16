// Product interfaces

//Button interface
interface Button {
    void render();
}


// Concrete class implementations for Windows
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering a Windows button");
    }
}

// Concrete class implementations for Mac
class MacButton implements Button {
    public void render() {
        System.out.println("Rendering a Mac button");
    }
}



// Abstract factory class
abstract class GUIFactory {
    abstract Button createButton();

}


// Concrete factory implementations
class WindowsFactory extends GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

}
class MacFactory extends GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

}
//Factory Producer class
class FactoryProducer {
    public static GUIFactory getFactory(boolean windows){
        if(windows){
            return new WindowsFactory();
        }else{
            return new MacFactory();
        }
    }
}


public class Main {
    public static void main(String[] args) {

        // Choose the desired GUI factory
        GUIFactory windowsStyleFactory = FactoryProducer.getFactory(true);
        GUIFactory macStyleFactory = FactoryProducer.getFactory(false);

        // Create UI components using the winFactory
        Button button1 = windowsStyleFactory.createButton();

        // Use the created components
        button1.render();

        // Create UI components using the macFactory
        Button button2 = macStyleFactory.createButton();

        // Use the created components
        button2.render();

    }
}