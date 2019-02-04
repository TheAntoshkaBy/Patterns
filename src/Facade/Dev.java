package Facade;

public class Dev {

    public void work(BugTracker bug)
    {
        if(bug.isBags())
            System.out.println("DO WORK IT!");
        else
            System.out.println("Go home Yanki!");

    }
}
