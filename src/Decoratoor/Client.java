package Decoratoor;

public class Client {
    public static void main(String[] args) {
        Deverlooper deverlooper = new SeniorJavaDev(new JavaDev());
        System.out.println(deverlooper.makeJob());
    }
}
