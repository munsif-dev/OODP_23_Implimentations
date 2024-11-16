interface Command{
    void execute();

    void undoExecute();
}
class Light{
    public void on(){
        System.out.println("Light On");
    }
    public void off(){
        System.out.println("Light Off");
    }
}
class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
    public void undoExecute() {
        light.off();
    }
}
class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
    public  void undoExecute() {
        light.on();
    }
}

class RemoteControl {
    Command slot;

    public RemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
    public void Undo() {
        slot.undoExecute();
    }
}


public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light light = new Light();


        LightOnCommand lightOn =
                new LightOnCommand(light);
        LightOffCommand lightOff =
                new LightOffCommand(light);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.Undo();
        remote.buttonWasPressed();

        remote.setCommand(lightOff);
        remote.buttonWasPressed();
        remote.Undo();
        remote.buttonWasPressed();



    }
}