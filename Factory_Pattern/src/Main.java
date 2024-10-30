//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
              System.out.println("this is main");
              OperatingSystemFactory osf = new OperatingSystemFactory();
              OS android_phone = osf.getInstance("Android");
              OS IOS_phone = osf.getInstance("IOS");
              android_phone.spec();
              IOS_phone.spec();
              OS anyPhone = osf.getInstance("windo");
              anyPhone.spec();
        }
    }
