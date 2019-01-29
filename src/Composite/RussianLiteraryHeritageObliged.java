package Composite;

import java.util.ArrayList;

public class RussianLiteraryHeritageObliged {

    ArrayList<Writers> writers;

    public  RussianLiteraryHeritageObliged()
    {
        writers = new ArrayList<>();
    }
    public ArrayList<Writers> getWriters() {
        return writers;
    }

    public void setWriters(ArrayList<Writers> writers) {
        this.writers = writers;
    }

    public void addWriters(Writers writers)
    {
        this.writers.add(writers);
    }

    public void createRussianLiteratureHeritage()
    {
        System.out.println("Russian Literature Heritage is created...");

        for(Writers writer : writers)
            writer.writeBook();
    }
}
