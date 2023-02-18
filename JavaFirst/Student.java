public class Student {
    public String name;
    public int age;
    public String group;

    public static void main(String[] arg) {
        Student som = new Student();
        som.setData("SomAA", 30, "65/55");
        som.getData();
        // som.name = "SomJa";
        // som.age = 20;
        // som.group = "65/65";
        System.out.println("-----------------------------------------------");
        som.setData("SomJa", 25, "65/05");
        som.getData();

        // som.printName();
        // som.printAge();
        // som.printGroup();

    }

    public void setData(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void getData() {
        System.out.println(this.name + " is " + this.age + " years old and is in gruop " + this.group);
    }

    /* Method */
    public void printName() {
        System.out.println("Student Name: " + this.name);
    }

    public void printAge() {
        System.out.println("Student Age : " + this.age);
    }

    public void printGroup() {
        System.out.println("Student Group : " + this.group);
    }

}