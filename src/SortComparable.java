//import java.lang.reflect.Field;
//
//public class SortComparable {
//    static void sort(Comparable[] a) {
//        int n = a.length;
//
//        for (int i = 0; i < n - 1; i++) {
//            int min_idx = i;
//            for (int j = i + 1; j < n; j++) {
//                if (a[j].compareTo(a[min_idx]) < 1) {
//                    min_idx = j;
//                }
//
//                Comparable temp = a[min_idx];
//                a[min_idx] = a[i];
//                a[i] = temp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Employee2 e1 = new Employee2("Stoyan");
//        Employee2 e2 = new Employee2("Ivan");
//        Employee2 e3 = new Employee2("Petar");
//        Employee2 e4 = new Employee2("Albena");
//
//        Employee2 ea[] = {e1, e2, e3, e4};
//        sort(ea, (Employee o1, Employee o2) -> {
//            if (o1.name.compareTo(o2.name) < 0) {
//                return 0;
//            }
//            return 1;
//        });
//        for (Employee2 em : ea) {
//            System.out.println(em.name);
//        }
//    }
//}
//
//class Employee2 {
//    String name = "";
//
//    public Employee2(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}