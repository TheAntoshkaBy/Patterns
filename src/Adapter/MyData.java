package Adapter;

//захотим записывать данные из этого класса в базу данных
public class MyData {

    public void saveData(){
        System.out.println("Данные сохранены!");
    }

    public void deleteData()
    {
        System.out.println("Данные удалены!");
    }
}
