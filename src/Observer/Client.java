package Observer;

public class Client {
    public static void main(String[] args) {
        AleksLibrary aleksandrLib = new AleksLibrary();
        
        Reader reader1 = new ReaderLib("Anton");
        Reader reader2 = new ReaderLib("Maksim");
        Reader reader3 = new ReaderLib("Nastya");
        
        aleksandrLib.addReader(reader1);
        aleksandrLib.addReader(reader3);
        
        aleksandrLib.newBook("Illiada");
        aleksandrLib.newBook("Odisseya");

        aleksandrLib.addReader(reader2);

        aleksandrLib.newBook("God's comedy");
    }
}
