package Visitor;

public class DataBase implements ProjectElement {
    @Override
    public void beWriten(Deverloper deverloper) {
        deverloper.create(this);
    }
}
