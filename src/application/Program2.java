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
        System.out.println("===TEST 1: department findAll");
        List<Department> departments = departmentDao.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }

        System.out.println();
        System.out.println("===TEST 2: department findById");
        System.out.print("Enter id for findById test: ");
        int id = scan.nextInt();
        Department department = departmentDao.findById(id);
        System.out.println("Department selected: " + department);

        scan.close();
    }
}
