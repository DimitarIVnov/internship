import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ObjArray {
    static Object[] createObjectArray(String className, String[] data) throws Exception {
        ArrayList<Object[]> fieldsData = new ArrayList<>();
        for (String str : data) {
            fieldsData.add(str.split(","));
        }

        Class aClass = Class.forName(className);
        Field[] fields = aClass.getDeclaredFields();
        Object[] objects = new Object[fieldsData.size()];
        for (int i = 0; i < fieldsData.size() - 1; i++) {
            Constructor constructor = aClass.getDeclaredConstructor(fields[0].getType(), fields[1].getType());
            Object param1 = fieldsData.get(i + 1)[0];
            String value = (String) (fieldsData.get(i + 1)[1]);
            Object param2 = Integer.valueOf(value);
            objects[i] = constructor.newInstance(param1, param2);
        }

        return objects;
    }

    public static void main(String[] args) throws Exception {
        String[] strArr = {
                "name,age",
                "Ivan,12",
                "Dragan,15",
                "Albena,25"
        };

        Object[] empArr = createObjectArray("EmpWithAge", strArr);
    }
}

