package oop.message_builder;

public class MessagePrinter {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }

    //Getter
    public void getMessage() {
        System.out.println(this.message);
    }


}
