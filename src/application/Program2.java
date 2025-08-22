package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println();
        System.out.println("===TEST 1: department findAll===");
        List<Department> departments = departmentDao.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }

        System.out.println();
        System.out.println("===TEST 2: department findById===");
        System.out.print("Enter id for findById test: ");
        int id = scan.nextInt();
        Department department = departmentDao.findById(id);
        System.out.println("Department selected: " + department);

        System.out.println();
        System.out.println("===TEST 3: department insert===");
        System.out.print("Enter Name for department insert: ");
        String departmentName = scan.next();
        Department depNew = new Department();
        depNew.setName(departmentName);
        departmentDao.insert(depNew);
        System.out.println("Department inserted: " + depNew);

        System.out.println();
        System.out.println("===TEST 4: department update===");
        System.out.print("Enter id for update test: ");
        int depUpdateId = scan.nextInt();
        scan.nextLine();
        depNew = departmentDao.findById(depUpdateId);
        if (depNew == null) {
            System.out.println("Department not found");
        } else {
            System.out.print("New Name for department update: ");
            String depUpdateName = scan.nextLine();
            depNew.setName(depUpdateName);
            departmentDao.update(depNew);
            System.out.println("Department updated: " + depNew);
        }

        scan.close();
    }
}
