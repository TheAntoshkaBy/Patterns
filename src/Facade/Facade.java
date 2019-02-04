package Facade;

public class Facade {

    Job job;
    BugTracker bugTracker;
    Dev dev;

    public Facade()
    {
       job  = new Job();
       bugTracker =  new BugTracker();
       dev = new Dev();
    }


    public void salveProblem()
    {
        job.doJob();
        bugTracker.newBag();
        dev.work(bugTracker);
    }

}
