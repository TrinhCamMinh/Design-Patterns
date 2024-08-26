package org.example.DesignPattern.Creational.FactoryMethod;

import org.example.DesignPattern.Creational.FactoryMethod.interfaces.Button;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
