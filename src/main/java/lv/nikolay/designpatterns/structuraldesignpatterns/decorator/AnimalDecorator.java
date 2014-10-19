package lv.nikolay.designpatterns.structuraldesignpatterns.decorator;

public abstract class AnimalDecorator implements Animal {

    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

}