package Visitor;

public class Project implements ProjectElement {

    ProjectElement[] projectElements;
    public Project()
    {
        this.projectElements = new ProjectElement[]{
                new ProjectClass(),
                new DataBase(),
                new Test()
        };
    }

    @Override
    public void beWriten(Deverloper deverloper) {
        for(ProjectElement projectElement : projectElements)
            projectElement.beWriten(deverloper);
    }
}
