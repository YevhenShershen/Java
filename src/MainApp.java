public class MainApp {
    public static void main(String[] args) {
        //переменная cat хронит ссылку на объект Cat =  оператор new заставляет выделить память
        // и после этого создаем сам объект Cat()
        Cat cat = new Cat();
        cat.name = "Barsik";
        cat.color = "White";
        cat.age = 2;
        cat.info();
    }
}
