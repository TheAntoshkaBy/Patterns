package State;

import Strategy.LiteraryTastes;

public class Europhean implements LiteratureTastes {
    @Override
    public void getFavoriteGenre() {
        System.out.println("My favorite genre is Russian classic!");
    }
}
