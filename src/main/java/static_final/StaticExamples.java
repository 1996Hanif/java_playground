package static_final;

public class StaticExamples {
    public static String canYouSeeME = "onlu in the class/object level";
    public String iAmAClassVar = "You can only see me when instantiated";

    public static void main(String[] args) {
        StaticExamples staticExamples = new StaticExamples();
        //only from object
        System.out.println(staticExamples.iAmAClassVar);
        //Static: only from class
        System.out.println(StaticExamples.canYouSeeME);
    }
}
