package example_1;

public class Main {
    public static void main(String[] args) {
//        example_1.Toyota toyota = new example_1.Toyota();
        Celica celica = new Celica();
        workInTaxi(celica);
    }
    static void workInTaxi(Car car){
        car.workInTaxi();
    }
}
