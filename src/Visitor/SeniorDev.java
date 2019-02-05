package Visitor;

public class SeniorDev implements Deverloper {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("rewrite class");
    }

    @Override
    public void create(DataBase dataBase) {

        System.out.println("Fix DaraBase");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create realible tests...");
    }
}
