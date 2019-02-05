package Observer;

import java.util.List;

public class ReaderLib extends AleksLibrary implements Reader {
    String name;

    public ReaderLib(String nm){
        name = nm;
    }

    @Override
    public void getMessageFromLib(List<String> books) {
     System.out.println("Dear " + name + " new books in your favorite library!");
     System.out.println(        "List of books "+books+"\n");

    }
}
