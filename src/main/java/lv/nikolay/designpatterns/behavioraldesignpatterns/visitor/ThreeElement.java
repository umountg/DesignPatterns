package lv.nikolay.designpatterns.behavioraldesignpatterns.visitor;

public class ThreeElement implements NumberElement {

    public int a;
    int b;
    int c;

    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }

}
