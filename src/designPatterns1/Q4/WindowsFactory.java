package Q4;

public class WindowsFactory extends WidgetAbstractFactory{
    public TextField createTextField() {
        return new WindowsTextField();
    }

    public PushButton createPushButton() {
        return new WindowsPushButton();
    }

    public ListBox createListBox(){
        return new WindowsListBox();
    }
}
