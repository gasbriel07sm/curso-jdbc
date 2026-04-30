package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: findById ===");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll ===");
        List<Department> list = new ArrayList<>();
        list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: insert ===");
        Department newDepartment = new Department(null, "MUSIC DANIELS");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id: " + newDepartment.getId());

        System.out.println("\n=== TEST 3: update ===");
        dep = departmentDao.findById(3);
        dep.setName("Gabriel DANIELS");
        departmentDao.update(dep);
        System.out.println("Updated complete!");

    }
}
