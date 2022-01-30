public class App {
    public static void main(String[] args) {
      Car mazda = new Car("Mazda" , 198 , false , 10);//класс авто +переменная+ new +конструктор
//при создании класса автоматически выполнился конструктор
        System.out.println(mazda.countSpeed(5));

        System.out.println(mazda.brand);//выводим информацию об объекте
        System.out.println(mazda.horsePower);
        System.out.println(mazda.isAwd);
      //указываем передоваемые аргументы даже если нет то()
        System.out.println(mazda.acceleration);
    }
}
