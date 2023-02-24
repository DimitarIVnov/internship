////interface Comparetor {
////    boolean compareTo(Object obj1, Object obj2) throws NoSuchFieldException, IllegalAccessException;
////}
//
//
//import java.util.Comparator;
//
//public class LMax<T> {
//    static EmpWithAge max(EmpWithAge[] arr, Comparator comparator) throws NoSuchFieldException, IllegalAccessException {
//
//        EmpWithAge max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (comparator.compare(max,arr[i]) < 1) {
//                max = arr[i];
//            }
//        }
//
//        return max;
//    }
//
//    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        EmpWithAge e1 = new EmpWithAge("Ivan", 25);
//        EmpWithAge e2 = new EmpWithAge("Niki", 33);
//        EmpWithAge e3 = new EmpWithAge("Desi", 12);
//        EmpWithAge[] people = {e1, e2, e3};
//        EmpWithAge oldest = max(people, (p1, p2) -> p1.age > p2.age);
//
//
//        System.out.println(oldest.name);
//    }
//}
