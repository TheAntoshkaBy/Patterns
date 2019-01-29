package Proxy;

public class Proxy implements Repository {

    NewRepository repository;
    String url;

    public Proxy(String url)
    {
        this.url = url;
    }


    @Override
    public void run() {
        if(repository == null)
           repository = new NewRepository(url);
        repository.run();
    }
}
