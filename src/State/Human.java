package State;

import Strategy.LiteraryTastes;

public class Human {
    LiteratureTastes literatureTastes;

    public void setActivity(LiteratureTastes literatureTastes) {
        this.literatureTastes = literatureTastes;
    }

    public void changeActivity()
    {
        if(literatureTastes instanceof American)
           setActivity(new Europhean());
        else if(literatureTastes instanceof Europhean)
            setActivity(new Asian());
        else if (literatureTastes instanceof Asian)
            setActivity(new American());
    }

    public void informMethod()
    {
        literatureTastes.getFavoriteGenre();
    }
}
