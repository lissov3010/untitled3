//имплемент это наследованте
public abstract class Car extends  Transport implements Rideable {// наследуем от транспорт
    String brand;
    int horsePower;
    boolean isAwd;//boolean как бы спрашиваем вопрос isAwd
    float acceleration;

    public Car() {
        this("Mazda" , 198 , false , 10);
       //brand = "Mazda";это всё конструктор
      //horsePower = 198;
       //isAwd = false;//ключивое слово this нужно в двух случаях при созданни я вного консруктора
       //acceleration = 10;//и если есть такоеже слово
        //если конструктор с параметрами весь этот текст не нужен
    }

    public Car(String brand, int horsePower, boolean isAwd, float acceleration) {
        this.brand = brand;//это конструктор с пораметрами
        this.horsePower = horsePower;
        this.isAwd = isAwd;
        this.acceleration = acceleration;
        this.type = "Car";//инициализируем в конструкторе
    }

    void setAcceleration(float acceleration){//создали метод с перед значением
        this.acceleration = acceleration;//обращение к полю а не к методу

    }
   // void start(){//создаем метод указываем тип данных возвращаемых
       // System.out.println("Brrrrr");//это все методы не возвращют

    //}
   //методы с возвращаемыми значениями
    float countSpeed(float time){
        return (100/acceleration)*time;
    }
    abstract void start();//это абстракция


    @Override
    public void ride() {//инициализируем альт + энтер
        System.out.println("Riding Car");//Выводим чем хотим управлять
        protectedType ="dd";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        return brand != null ? brand.hashCode() : 0;
    }
}
