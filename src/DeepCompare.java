import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class DeepCompare {

    static boolean compare(Object ob1, Object ob2) throws IllegalAccessException {
        if (!ob1.getClass().equals(ob2.getClass())) {
            return false;
        }

        Field[] objectFields = ob1.getClass().getDeclaredFields();

        for (int i = 0; i < objectFields.length; i++) {
            Object ob1FieldValue = objectFields[i].get(ob1);
            Object ob2FieldValue = objectFields[i].get(ob2);
            if (objectFields[i].getType().isPrimitive() || objectFields[i].getType().equals(String.class)) {
                if (!ob1FieldValue.equals(ob2FieldValue)) {
                    return false;
                }
            } else if (objectFields[i].getType().isArray()) {
                int index = 0;
                for (int j = 0; j < Array.getLength(objectFields[i].get(ob1)); j++) {
                    if (!Array.get(objectFields[i].get(ob1), index).equals(Array.get(objectFields[i].get(ob2), index))) {
                        return false;
                    }
                    index++;
                }
            } else {
                if (!compare(objectFields[i].get(ob1), objectFields[i].get(ob2))) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
//        Manager m1 = new Manager("Svilen");
//        Employee e1 = new Employee("Ivan", m1);
//
//        Manager m2 = new Manager("Refo");
//        Employee e2 = new Employee("Daniela", m2);
//
//        Manager m3 = new Manager("Refo");
//        Employee e3 = new Employee("Ivan", m3);
//
//        Manager m4 = new Manager("Svilen");
//        Employee e4 = new Employee("Ivan", m4);
//
//        Employee e5 = new Employee("Ivan", m1);
//
//        System.out.println(compare(e1, e2));
//        System.out.println(compare(e1, e3));
//        System.out.println(compare(e1, e4));
//        System.out.println(compare(e1, e5));
//
//        Object[] aww = {1, e1, 3, 4, 5};
//        Tester b1 = new Tester(aww, "Kiro");
//        Object[] aww2 = {1, e1,  3, 4, 5};
//        Tester b2 = new Tester(aww2, "Kiro");
//
//        System.out.println(compare(b1, b2));
//        int arr[] = new int[1];

    }
}
