package lv.nikolay.designpatterns.behavioraldesignpatterns.visitor;

public interface NumberElement {

    public void accept(NumberVisitor visitor);

}