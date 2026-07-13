class Employee{
    // this code explains use case of constructor chaining
    //when all the parameters of constructor can't be supplied values bu user
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public Employee(int id, String name){
        //in case the department is not allotted, then employee can call this constructor
        this(id, name, "not alloted");
    }
}