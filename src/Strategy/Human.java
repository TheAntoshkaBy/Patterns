package Strategy;

public class Human {

    LiteraryTastes literaryTastes;
    //наш класс имеет в себе возможность использовать схожие способности всех классов имплементированных от данного.
    public void setActivity(LiteraryTastes literaryTastes) {
        this.literaryTastes = literaryTastes;
    }

    public void informMethod()
    {
        literaryTastes.getFavoriteGenre();
    }
}
