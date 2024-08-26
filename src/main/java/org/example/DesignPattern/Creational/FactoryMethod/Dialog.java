package org.example.DesignPattern.Creational.FactoryMethod;
import org.example.DesignPattern.Creational.FactoryMethod.interfaces.Button;

public abstract class Dialog {
    private Button button;
    /**
         * Subclasses will override this method in order to create specific button
         * objects.
     */
    public abstract Button createButton();

    public Button renderButton() {
        this.button = createButton();
        button.render();
        return this.button;
    }

    public void handleOnClickButton() {
        button.onClick();
    }
}
