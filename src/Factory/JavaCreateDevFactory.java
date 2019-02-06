package Factory;

public class JavaCreateDevFactory implements DevFactory {
    @Override
    public Deverloper createDeverloper() {
        return new JavaDeverloper();
    }
}
