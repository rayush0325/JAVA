class  Student extends User{
    //usecase - initialization of object state in a particular order
    //first the state of parent class variables will be initialised
    String course;
    public Student(int id, String name, String course){
        super(id, name);
        this.course = course;
    }
}