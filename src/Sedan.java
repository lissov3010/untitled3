public class Sedan extends Car{
    public Sedan(String brand, int horsePower, boolean isAwd, float acceleration) {
        super(brand, horsePower, isAwd, acceleration);//ЯВЛЯЕТСЯ УКАЗАТЕЛЕМ НА СУПЕР КЛАСС
    }
    @Override
    void start(){
        System.out.println("Starting Sedan");
    }

}
