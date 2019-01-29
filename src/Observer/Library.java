package Observer;

public interface Library {
    void addReader(Reader reader);
    void removeReader(Reader reader);
    void callReaders();
}
