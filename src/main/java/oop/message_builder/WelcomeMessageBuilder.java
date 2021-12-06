package oop.message_builder;

public class WelcomeMessageBuilder {
    private String name;
    private String welcomeMessage;

    public WelcomeMessageBuilder(String name, String welcomeMessage) {
        this.name = name;
        this.welcomeMessage = welcomeMessage;
    }

    public String welcomeMessageBuilder(){
        return "hi!, " + this.name + ", " + this.welcomeMessage;
    }
}
