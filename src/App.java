public class App {
    public static void main(String[] args) {
      Rideable mazda = new Sedan("Mazda" , 198 , false , 10);//класс авто +переменная+ new +конструктор
//при создании класса автоматически выполнился конструктор
        Rideable boat = new Boat();


        ((Sedan) mazda).start();//приводим к абстракции
        //mazda.ride();
        boat.ride();
        Transport transport = new Transport();//кон + альт + в
        transport.publicType = "Transport";
        transport.protectedType = "ee";
        // System.out.println(mazda.countSpeed(5));
        //System.out.println(mazda);//Выводим в консоль
       // mazda.ride();

       // System.out.println(mazda.brand);//выводим информацию об объекте
       // System.out.println(mazda.horsePower);
        //System.out.println(mazda.isAwd);
      //указываем передоваемые аргументы даже если нет то()
       //System.out.println(mazda.acceleration);
    }
}
