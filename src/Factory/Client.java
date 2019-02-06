package Factory;

public class Client {
    public static void main(String[] args) {
        DevFactory deverloperFac =createDevBySpeciality("Java");
        Deverloper deverloper = deverloperFac.createDeverloper();

        deverloper.writeCode();


    }

    static DevFactory createDevBySpeciality(String spec)
    {
        if(spec.equalsIgnoreCase("Java"))
        {
            return new JavaCreateDevFactory();
        }else{
            return new CppDevFactory();
        }
    }
}
