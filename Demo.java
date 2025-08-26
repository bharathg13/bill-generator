import java.util.ArrayList;
import java.util.Scanner;

class Emp {
    int eid;
    String ename;
    String address;

    Emp(int eid, String ename, String address) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
    }

    void display() {
        System.out.println("EID: " + eid + ", Name: " + ename + ", Address: " + address);
    }
}


class Dept {
    int dept_id;
    String dname;
    int mgr_id;

    Dept(int dept_id, String dname, int mgr_id) {
        this.dept_id = dept_id;
        this.dname = dname;
        this.mgr_id = mgr_id;
    }

    void display() {
        System.out.println("Dept ID: " + dept_id + ", Dept Name: " + dname + ", Manager ID: " + mgr_id);
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Emp> empList = new ArrayList<>();
        ArrayList<Dept> deptList = new ArrayList<>();

        System.out.println("Enter 3 Employee details:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter eid: ");
            int eid = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter ename: ");
            String ename = sc.nextLine();
            System.out.print("Enter address: ");
            String address = sc.nextLine();

            empList.add(new Emp(eid, ename, address));
        }

        System.out.println("\nEnter 3 Department details:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter dept_id: ");
            int dept_id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter dname: ");
            String dname = sc.nextLine();
            System.out.print("Enter mgr_id: ");
            int mgr_id = sc.nextInt();

            deptList.add(new Dept(dept_id, dname, mgr_id));
        }

        System.out.println("\nEmployee Details:");
        for (Emp e : empList) {
            e.display();
        }

        System.out.println("\nDepartment Details:");
        for (Dept d : deptList) {
            d.display();
        }

        sc.close();
    }
}
