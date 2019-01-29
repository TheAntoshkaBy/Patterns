package Iterator;

import java.util.ArrayList;

public class Reader implements Library {

    private String name;
    private ArrayList<String> library;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLibrary(ArrayList<String> lib)
    {
        library = lib;
    }

    public ArrayList<String> getLibrary()
    {
        return library;
    }


    @Override
    public Iterator getIterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator{
        int index;


        @Override
        public boolean hasNext() {
            if(index<library.size())
                return true;
            else
                       return false;
        }

        @Override
        public Object next() {
            return library.get(index++);
        }
    }
}
