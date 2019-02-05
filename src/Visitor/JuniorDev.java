package Visitor;

public class JuniorDev implements Deverloper {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Bad Class");
    }

    @Override
    public void create(DataBase dataBase) {
        System.out.println("Drop database..");
    }

    @Override
    public void create(Test test) {
        System.out.println("Not realible Teats");

    }
}
