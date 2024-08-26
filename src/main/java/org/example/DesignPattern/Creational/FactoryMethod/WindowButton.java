package org.example.DesignPattern.Creational.FactoryMethod;

import org.example.DesignPattern.Creational.FactoryMethod.interfaces.Button;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Window Button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Window Button pressed");
    }
}
