package Q4;

public class LinuxFactory extends WidgetAbstractFactory{
    public TextField createTextField() {
        return new LinuxTextField();
    }

    public PushButton createPushButton() {
        return new LinuxPushButton();
    }

    public ListBox createListBox() {
        return new LinuxListBox();
    }
}
