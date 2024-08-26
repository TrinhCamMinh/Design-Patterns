package org.example.DesignPattern.Creational.FactoryMethod;

import org.example.DesignPattern.Creational.FactoryMethod.interfaces.Button;

public class Application {
    private Dialog dialog;

    void configure() {
        if(System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WebDialog();
        } else {
            dialog = new WindowDialog();
        }
    }

    void runBusinessLogic() {
        Button button = dialog.renderButton();
        dialog.handleOnClickButton();

        if(dialog instanceof WebDialog) {
            ((WebDialog) dialog).handleSpecialRequirement(button);
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.configure();
        application.runBusinessLogic();
    }
}
