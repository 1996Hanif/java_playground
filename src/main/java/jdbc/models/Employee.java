package jdbc.models;

public class Employee {
    private int id;
    private String fName;
    private String sName;

    public Employee(int id, String fname, String sname) {
        this.id = id;
        this.fName = fname;
        this.sName = sname;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fName;
    }

    public String getSname() {
        return sName;
    }
}
