package Q4;

import java.util.Scanner;

public class WidgetDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WidgetAbstractFactory wFactory = null;

        String nextWidget = sc.nextLine(); //reading the input from the console

        if (nextWidget.equals("MS-Windows")) {
            System.out.println("\nMS-Windows OS selected");
            wFactory = new WindowsFactory();
        } else if (nextWidget.equals("Mac OS")) {
            System.out.println("\nMac OS selected");
            wFactory = new IOSFactory();
        } else if (nextWidget.equals("Linux")) {
            System.out.println("\nLinux OS selected");
            wFactory = new LinuxFactory();
        } else {
            System.out.println("Invalid OS entered.");
            System.exit(0);
        }

        TextField wTextField = wFactory.createTextField();
        PushButton wPushButton = wFactory.createPushButton();
        ListBox wListBox = wFactory.createListBox();

        System.out.println("\nWidget list for " + nextWidget + " operating system");
        System.out.println(wTextField.renderTextField());
        System.out.println(wPushButton.renderPushButton());
        System.out.println(wListBox.renderListBox());
    }
}
