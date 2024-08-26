package org.example.DesignPattern.Creational.FactoryMethod;

import org.example.DesignPattern.Creational.FactoryMethod.interfaces.WebButtonInterface;

public class WebButton implements WebButtonInterface {
    @Override
    public void render() {
        System.out.println("Web Button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Web Button pressed");
    }

    @Override
    public void specialRequirement() {
        System.out.println("Hey it's work. This is a special function for Web Button product only");
    }
}
