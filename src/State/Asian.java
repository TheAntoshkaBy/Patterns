package State;

import Strategy.LiteraryTastes;

public class Asian implements LiteratureTastes {

    @Override
    public void getFavoriteGenre() {
        System.out.println("My favorite genre is Koran and all related literature...");
    }
}
