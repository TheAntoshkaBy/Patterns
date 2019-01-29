package Composite;

public class Client {
    public static void main(String[] args) {
        RussianLiteraryHeritageObliged writers = new RussianLiteraryHeritageObliged();

        writers.addWriters(new Tolstoy());
        writers.addWriters(new Dostoevskiy());

        writers.createRussianLiteratureHeritage();
    }
}
