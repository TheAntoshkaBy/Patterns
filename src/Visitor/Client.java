package Visitor;

import Facade.Dev;

public class Client {
    public static void main(String[] args) {
        Project project = new Project();

        Deverloper junior = new JuniorDev();
        Deverloper senior = new SeniorDev();

        System.out.println("Junior is action..");
        project.beWriten(junior);

        System.out.println(
                "Senior be action..."
        );
        project.beWriten(senior);

    }
}
