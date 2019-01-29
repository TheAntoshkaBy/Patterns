package Observer;

import java.util.ArrayList;

public class AleksLibrary implements Library{

    ArrayList<Reader> readers = new ArrayList<>();
    ArrayList<String> books = new ArrayList<>();

    public void newBook(String book)
    {
        books.add(book);
        callReaders();
    }

    @Override
    public void addReader(Reader reader) {
        readers.add(reader);
    }

    @Override
    public void removeReader(Reader reader) {
        readers.remove(reader);
    }

    @Override
    public void callReaders() {
        for(Reader r : readers)
        {
            r.getMessageFromLib(books);
        }
    }
}
