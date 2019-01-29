package Adapter;

public class MyDB implements DataBase {
    @Override
    public void insert() {

        System.out.println("Вставка нового поля");
    }

    @Override
    public void remove() {
        System.out.println("Удаление поля");
    }
}
