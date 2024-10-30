//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        phoneBuilder builder = new phoneBuilder();
        builder.setOS("Android");
        builder.setProcessor("COre_i3");
        Phone p = builder.getPhone();
        System.out.println(p);
        }
    }
