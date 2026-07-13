public class Main{
    public static void main(String[] args){

        Employee employee= null;
        try{
//            employee = new Employee(1, "ayush", 19);
//            employee = new Employee(2, "ayush", 20);
            employee = new Employee(2, "ayush", 21);
            System.out.println(employee.getId()+" "+employee.getName()+" "+ employee.getAge());
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        if(employee != null){
            System.out.println("employee obj is created if age >= 20");
        }

    }
}