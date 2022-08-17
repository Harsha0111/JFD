public class Company {
    public static void main(String[] args) {
        Emp empOne = new Emp();
        Emp empTwo = new Emp();
        Emp empThree = new Emp(222, "asa", "sdsada", 42423, "asdsa");
        Emp empFour = new Emp(223, "asga", "sdsajjda", 424283, "asdsmma");
        Emp empFive = new Emp(223, "asga", "sdsajjda");

        empOne.setId(001);
        empOne.setName("MEGA");
        empOne.setPhone(85313);
        empOne.setRole("Tester");
        empOne.setEmail("mega@gmail.com");

        empTwo.setId(002);
        empTwo.setName("KAVIYA");
        empTwo.setPhone(654233);
        empTwo.setRole("Developer");
        empTwo.setEmail("kaviya@gmail.com");

        empThree.showEmpDetails();
        empFour.showEmpDetails();


        empFive.setRole("Developer 34");
        empFive.setPhone(654233);
        empFive.showEmpDetails();

    }
}

