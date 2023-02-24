import java.util.Arrays;

interface Condition {
    boolean isValid(Object o);
}

public class Filter {
    static Object[] filter(Object[] objArr, Condition startWithACond) {
        Object[] resultObjArr = new Object[objArr.length];
        int notNullCount = 0;

        for (int i = 0; i < objArr.length; i++) {
            if (startWithACond.isValid(objArr[i])) {
                resultObjArr[i] = objArr[i];
                notNullCount++;
            }
        }
        Object[] notNullResult = new Object[notNullCount];
        int j = 0;
        for (int i = 0; i < objArr.length; i++) {
            if (resultObjArr[i] != null) {
                notNullResult[j] = resultObjArr[i];
                j++;
            }
        }

        return notNullResult;
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Stoyan");
        Employee1 e2 = new Employee1("Ivan");
        Employee1 e3 = new Employee1("Petar");
        Employee1 e4 = new Employee1("Albena");
        Employee1 ea[] = {e1, e2, e3, e4};

        Condition startWithACond = new Condition() {
            // върща true само ако името започва с А
            public boolean isValid(Object o) {
                if (!(o instanceof Employee)) {
                    return false;
                }
                Employee e = (Employee) o;
                String name = e.getName();
                return name.startsWith("A");
            }
        };

        Object[] onlyAObj = filter(ea, startWithACond);
        Employee[] onlyAObEmp = Arrays.copyOf(onlyAObj, onlyAObj.length, Employee[].class);
        for (Employee emp : onlyAObEmp) {
            System.out.println(emp.name);
        }
    }
}

class Employee1 {
    String name = "";
    public Employee1(String name) {
        this.name = name;
    }

}