package Decoratoor;

public class SeniorJavaDev extends DecoratorDev {


    public SeniorJavaDev(Deverlooper deverlooper) {
        super(deverlooper);
    }

    public String makeCodeReview()
    {
        return "Make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReview();
    }
}
