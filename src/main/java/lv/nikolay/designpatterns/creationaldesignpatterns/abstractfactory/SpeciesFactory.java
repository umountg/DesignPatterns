package lv.nikolay.designpatterns.creationaldesignpatterns.abstractfactory;


public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}