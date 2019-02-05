package Decoratoor;

public class DecoratorDev implements Deverlooper {

    Deverlooper deverlooper;

    public DecoratorDev(Deverlooper deverlooper)
    {
        this.deverlooper = deverlooper;
    }

    @Override
    public String makeJob() {
        return deverlooper.makeJob();
    }
}
