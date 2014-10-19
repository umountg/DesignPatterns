package lv.nikolay.designpatterns.behavioraldesignpatterns.mediator;

public class SwedishBuyer extends Buyer {

    public SwedishBuyer(Mediator mediator) {
        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}