import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeepStrArr {
    static String[] getDeepStrArr(Object... objs) throws IllegalAccessException {
        ArrayList<String> stringArr = new ArrayList<>();
        ArrayList<Field[]> fieldsArr = new ArrayList<>();
        for (Object obj : objs) {
            if (obj.getClass().equals(String.class)) {
                stringArr.add((String) obj);
            }
            fieldsArr.add(obj.getClass().getDeclaredFields());

        }
        for (int i = 0; i < fieldsArr.size(); i++) {
            for (int j = 0; j < fieldsArr.get(i).length; j++) {
                if (fieldsArr.get(i)[j].getType() == null || fieldsArr.get(i)[j].getType().isPrimitive()) {
                    continue;
                } else if (fieldsArr.get(i)[j].getType().equals(String.class)) {
                    stringArr.add((String) fieldsArr.get(i)[j].get(objs[i]));
                } else if (fieldsArr.get(i)[j].getType().isArray()) {
                    stringArr.addAll(List.of(getDeepStrArr(fieldsArr.get(i)[j])));
                }
                else {
                    System.out.println(fieldsArr.get(i));
                    String[] tempStrArr = getDeepStrArr(fieldsArr.get(i)[j].get(objs[i]));
                    stringArr.addAll(Arrays.asList(tempStrArr));
                }
            }
        }

        String[] resultArr = new String[stringArr.size()];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = stringArr.get(i);
        }
        return resultArr;
    }


    public static void main(String[] args) throws IllegalAccessException {
        Manager m1 = new Manager("m1");
        Manager m2 = new Manager("m2");
        Manager m3 = new Manager("m3");
        Manager m4 = new Manager("m4");
        Employee e1 = new Employee("Stoyan", m1);
        Employee e2 = new Employee("Ivan", m2);
        Employee e3 = new Employee("Petar", m3);
        Employee e4 = new Employee("Albena", m4);
        Tester ts = new Tester("test");

        String[] strArr = getDeepStrArr(ts,e1, e2, e3, e4, "aa");
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}
