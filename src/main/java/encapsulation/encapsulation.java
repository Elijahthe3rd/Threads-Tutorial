package encapsulation;

public class encapsulation {
    /* protected (private access modifier)variables
     * (N.B ) this variables can't be used
     * or accessed from external classes, that can be done only by members of this class
     */
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int ageIn) {
        this.age = ageIn;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    protected void printUserDetails(){
        String name= getName();
        int age= getAge();
        String output=new String("Name: "+name+"\nAge:"+age);
        System.out.println(output);
    }

}

