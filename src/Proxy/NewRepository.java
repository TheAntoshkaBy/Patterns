package Proxy;

public class NewRepository implements Repository {
    private String url;

    public NewRepository(String url)
    {
        this.url = url;
        load();
    }

   private void load()
    {
        System.out.println("Loading project!");
    }

    @Override
    public void run() {
        System.out.println("Project run!");
    }
}
