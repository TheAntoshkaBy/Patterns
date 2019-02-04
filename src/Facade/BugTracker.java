package Facade;

public class BugTracker {
    private boolean bags;

    public boolean isBags() {
        return bags;
    }

    public void newBag()
    {
        bags = true;
    }

    public void deleteBag()
    {
        bags = false;
    }
}
