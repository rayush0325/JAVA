class Employee{
    //this code displays use case of constructor
    //in which object creation is stopped on the basis of some condition

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age){
        this.id = id;
        this.name =  name;
        if(age < 20){
            //object won't be created
            throw new RuntimeException("employee not created if age < 20");
        }
        this.age = age;
    }
    public int getId(){
        return this.id;
    }
    public  String getName(){
        return this.name;
    }
    public int getAge(){
        return  this.age;
    }
}