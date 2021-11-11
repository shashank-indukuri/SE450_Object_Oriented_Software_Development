package Q4;

public class IOSFactory extends WidgetAbstractFactory {
    public TextField createTextField() {
        return new IOSTextField();
    }

    public PushButton createPushButton() {
        return new IOSPushButton();
    }

    public ListBox createListBox() {
        return new IOSListBox();
    }
}
