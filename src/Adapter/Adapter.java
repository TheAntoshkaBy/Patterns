package Adapter;

public class Adapter  extends MyData implements DataBase {
    @Override
    public void insert() {
        saveData();
    }

    @Override
    public void remove() {
        deleteData();
    }
}
