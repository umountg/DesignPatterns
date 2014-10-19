package lv.nikolay.designpatterns.creationaldesignpatterns.factory;

public class Dog extends Animal {

    @Override
    public String makeSound() {
        return "Woof";
    }

}