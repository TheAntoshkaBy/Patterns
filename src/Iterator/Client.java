package Iterator;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        ArrayList<String> library = new ArrayList<>();
        library.add("Illiada");
        library.add("Odisseya");

        Reader reader = new Reader();
        reader.setLibrary(library);

        Iterator it = reader.getIterator();

        while (it.hasNext())
            System.out.println(it.next());

    }
}
