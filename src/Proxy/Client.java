package Proxy;


/**
 * Используем Proxy
 * Когда надо осуществлять взаимодействие по сети, а объект-проси должен
 имитировать поведения объекта в др. адресном пространстве. Использование прокси
 позволяет снизить накладные издержки при передачи данных через сеть. Подобная
 ситуация называется удалённый заместитель (remote proxies).
 • Когда нужно управлять доступом к ресурсу, создание которого требует больших
 затрат. Реальный объект создается только тогда, когда он действительно может
 понадобится, а до этого все запросы к нему обрабатывает прокси-объект. Подобная
 ситуация наз-ся виртуальный заместитель (virtual proxies).
 • Когда необходимо разграничить доступ к вызываемому объекту в зависимости
 от прав вызывающего объекта. Подобная ситуация наз-ся защищающий заместитель
 (protection proxies).
 • Когда нужно вести подсчёт ссылок на объект или обеспечить потокобезопасную
 работу с реальным объектом. Подобная ситуация называется "умные ссылки" (smart
 reference).
 *
 * */
public class Client {
    public static void main(String[] args) {
        Repository repository = new Proxy("https://github.com/TheAntoshkaBy/Game.World.of.Tanks.aka.my.First.game.project");
        Repository repository1 = new NewRepository("https://github.com/TheAntoshkaBy/Game.World.of.Tanks.aka.my.First.game.project");
    }
}