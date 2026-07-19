import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
class MyList{
    public static void main(String[] args) {
        int N = 10000000;

        String[] nameList = new String[N];
        int[] salaryList = new int[N];


        List<Employee> list = new ArrayList<>();
//        List<Employee> list = new LinkedList<>();

        long startTime = System.nanoTime();
        for(int i = 1 ; i <= N ; i++){
            list.add(new Employee(i, i+"", i*10));
        }
        long endTime = System.nanoTime();
        long durationMillis = (endTime - startTime) / 1_000_000;
        System.out.printf("\ntime to add elements %d\n",durationMillis);

        //iterate-----------------------

        Employee employee = null;
        Iterator<Employee> iterator = list.iterator();

        startTime = System.nanoTime();
        while(iterator.hasNext()){
            employee = iterator.next();
//            System.out.printf("\nid = %d, name = %s, salary = %d\n", employee.id, employee.name, employee.salary);
        }
        endTime = System.nanoTime();
        durationMillis = (endTime - startTime) / 1_000_000;
        System.out.printf("\ntime to iterate elements %d\n",durationMillis);

        //get------------------------

        startTime = System.nanoTime();

        employee = list.get(7649);

        endTime = System.nanoTime();
        durationMillis = (endTime - startTime) / 1_000_000;
        System.out.printf("\ntime to get element %d\n",durationMillis);

        //set
        startTime = System.nanoTime();

        employee = list.set(7649, null);

        endTime = System.nanoTime();
        durationMillis = (endTime - startTime) / 1_000_000;
        System.out.printf("\ntime to set element %d\n",durationMillis);

        //add at start
        startTime = System.nanoTime();

        list.add(0, new Employee(-1, -1+"", -10));

        endTime = System.nanoTime();
        durationMillis = (endTime - startTime) / 1_000_000;
        System.out.printf("\ntime to add at start  %d\n",durationMillis);

        //add at random position
        startTime = System.nanoTime();

        list.add(8732, new Employee(-1, -1+"", -10));

        endTime = System.nanoTime();
        durationMillis = (endTime - startTime) / 1_000_000;
        System.out.printf("\ntime to add at random position %d\n",durationMillis);
    }

}