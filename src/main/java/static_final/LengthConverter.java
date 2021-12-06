package static_final;

public class LengthConverter {

    public static double metresToCentimetres(double metres){
        return metres * 100;
    }

    public static void main(String[] args) {
        System.out.println(LengthConverter.metresToCentimetres(1));
    }
}
