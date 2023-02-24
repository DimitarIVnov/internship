public class Manager {
    String name = " ";

    public Manager(String name) {
        this.name = name;
    }
}


class Employee  {
    String name = "";
    Manager manager = null;

    public Employee(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }



}

class Tester {
    Object[] arr = {1, "1111", 3, 4, 5};
    public String name;

    public Tester(String name) {
        this.name = name;
    }

    public Tester(Object[] arr, String name) {
        this.arr = arr;
        this.name = name;
    }

}
