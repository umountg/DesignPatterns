package lv.nikolay.designpatterns.behavioraldesignpatterns.visitor;

public class TwoElement implements NumberElement {

    int a;
    int b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }

}