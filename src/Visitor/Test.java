package Visitor;

public class Test implements ProjectElement {
    @Override
    public void beWriten(Deverloper deverloper) {
        deverloper.create(this);
    }
}
