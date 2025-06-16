package day4;

class OopsConceptDemo {
    private int serialNum;
    private String name;
    private int age;

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Serial Number: " + serialNum + "\nName: " + name + "\nAge: " + age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        OopsConceptDemo obj = new OopsConceptDemo();
        obj.setSerialNum(101);
        obj.setName("Naveed");
        obj.setAge(20);
        System.out.println(obj);
    }
}
