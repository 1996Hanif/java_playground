package enums;

public enum Day {
    MONDAY("m"),
    TUESDAY("tu"),
    WEDNESDAY("w"),
    THURSDAY("th"),
    FRIDAY("f"),
    SATURDAY("sa"),
    SUNDAY("su"),
    ;

    private String description;

    Day(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        Day friday = Day.FRIDAY;
        System.out.println();
    }
}
