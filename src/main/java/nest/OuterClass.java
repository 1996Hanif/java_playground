package nest;

public class OuterClass {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int number = 20;

    public static class InnerClass{
        OuterClass outerClass = new OuterClass();
        public int method(){
            this.outerClass.setNumber(50);
            return this.outerClass.getNumber();

        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.method());

    }
}
