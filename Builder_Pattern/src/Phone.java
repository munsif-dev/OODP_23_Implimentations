public class Phone {
    private String OS;
    private int ram;
    private String processor;
    private double screenSize;
    private int Battery;

    public Phone(String OS, int ram, String processor, double screenSize, int battery) {
        super();
        this.OS = OS;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        Battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", Battery=" + Battery +
                '}';
    }
}
