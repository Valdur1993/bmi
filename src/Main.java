public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; //кг
        double height = 1.87; //м
        double BodyMassIndex = (int) service.calculate(weight, height);
        System.out.println ("Индекс массы тела : " + (int)BodyMassIndex + "кг/㎡");
    }
}