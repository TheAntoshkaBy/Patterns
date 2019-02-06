package Factory;

public class CppDevFactory implements DevFactory  {
    @Override
    public Deverloper createDeverloper() {
        return new CppDeverloper();
    }
}
