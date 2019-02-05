package Memento;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHub gitHub = new GitHub();

        System.out.println("New project version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving new version");
        gitHub.setSaver(project.save());

        Thread.sleep(5000);

        System.out.println("Update");

        project.setVersionAndDate("fdkslfksl");

        System.out.println(project);

        project.load(gitHub.getSaver());

        System.out.println(project);
    }
}
