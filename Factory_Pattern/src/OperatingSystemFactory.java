public class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Android"))
            return new Android();
        else if (str.equals("IOS")) {
            return new IOS();
        }
        else
            return new Windows();
    }

// If a new Class come we don't need to change the main function, we just only add a new class on the factory
// We should Create a Class in any package, than import
    // Than we need to add that class in factory class.
    // SO the Main function will not be changed anymore.


}
