package Adapter;

/**
 * Адаптер — структурный шаблон проектирования, предназначенный для организации
 использования функций объекта, недоступного для модификации, через специально
 созданный интерфейс.
 */

public class Client {
    public static void main(String[] args) {
        DataBase dataBase = new Adapter();

        dataBase.insert();
        dataBase.remove();
    }
}
