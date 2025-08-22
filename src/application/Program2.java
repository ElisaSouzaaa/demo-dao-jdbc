package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println();
        System.out.println("===TEST 1: department findAll");
        List<Department> departments = departmentDao.findAll();
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
