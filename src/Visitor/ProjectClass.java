package Visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWriten(Deverloper deverloper) {
        deverloper.create(this);
    }
}
