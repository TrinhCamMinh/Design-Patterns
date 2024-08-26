package org.example.DesignPattern.Creational.FactoryMethod;
import org.example.DesignPattern.Creational.FactoryMethod.interfaces.Button;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }

    public void handleSpecialRequirement(Button button) {
        WebButton webBtn = (WebButton) button;
        webBtn.specialRequirement();
    }
}