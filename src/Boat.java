public class Boat implements Rideable , Swimmable{//Наследуем от нескольких интерфейсов
    @Override
    public void ride() {
        System.out.println("Riding Boat");

    }

    @Override
    public void swim() {

    }
}
