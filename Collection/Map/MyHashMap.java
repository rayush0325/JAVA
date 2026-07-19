import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Hashtable;
class MyHashMap{
    public static void main(String[] args) {
//        Map<String, Employee> map = new HashMap<>();
        Map<String, Employee> map = new Hashtable();

        String[] nameList = {"A", "B", "C", "D", "E", "F", "G","H"};
        int[] salaryList = {100, 200, 300, 400, 500, 600, 700, 800};

        int N = nameList.length;
        for(int i = 0 ; i < N ; i++){
            map.put(nameList[i], new Employee(i, nameList[i], salaryList[i]));
        }
        Employee employee = map.get("B");
        System.out.printf("id = %d | name = %s | salary = %d",employee.id, employee.name, employee.salary);

        map.get("C").salary = 350;
        employee = map.get("C");
        System.out.printf("\nid = %d | name = %s | salary = %d\n",employee.id, employee.name, employee.salary);

        System.out.println(map.containsKey("D"));
        System.out.println(map.containsKey("Z"));

//        Iterator<Map.Entry<String, Employee>> iterator = hashmap.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String, Employee> entry = iterator.next();
//            employee = entry.getValue();
//            System.out.printf("id = %d | name = %s | salary = %d\n",employee.id, employee.name, employee.salary);
//        }

//        for(Map.Entry<String, Employee> entry: hashmap.entrySet()){
//            employee = entry.getValue();
//            System.out.printf("id = %d | name = %s | salary = %d\n",employee.id, employee.name, employee.salary);
//        }

        for(Employee employee1 : map.values()){
            System.out.printf("id = %d | name = %s | salary = %d\n",employee.id, employee.name, employee.salary);
        }


    }
}