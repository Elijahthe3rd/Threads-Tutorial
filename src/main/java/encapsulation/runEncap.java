package encapsulation;

public class runEncap {

    public static void main(String[] args) {

        /* creating object/ var of type encapsulation class
         * that store new instance/object of class encapsulation*/
        encapsulation encapsulationClass=new encapsulation();

        /* access variables via newly created class object
         * and set the variable data through setter method*/
        encapsulationClass.setAge(8);
        encapsulationClass.setName("Hector");

        /* Printing out the above set value through method in class called printUserDetails()
         * altinativele you can just use the getter methods via our local instance called
         *
         */
        System.out.println();
        encapsulationClass.printUserDetails();

        System.out.println("\nBenefits of Encapsulation\n\n" +
                "* The fields of a class can be made read-only or write-only.\n" +
                "\n" +
                "* A class can have total control over what is stored in its fields.");
    }
}
