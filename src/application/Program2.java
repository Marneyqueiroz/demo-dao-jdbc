package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		
		
		Department dep = depDao.findByid(2);
		
		System.out.println("***Test 1: Find By ID***");
		System.out.println(dep);
		System.out.println();
		
		
		System.out.println();
		System.out.println("***Test 2: Find All***");
		List<Department> list = depDao.findAll();
		
		for (Department obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println();
		System.out.println("***Test 3: Department Insert***");
		Department newDepartment = new Department(null, "Futebol");
		depDao.insert(newDepartment);
		System.out.println("Inserted! New id = "+ newDepartment.getId());
		
		System.out.println();
		System.out.println("***Test 4: Seller Update***");
		dep = depDao.findByid(5);
		dep.setName("Basquete");
		depDao.update(dep);
		System.out.println("Updated Complited!");
		
		/*System.out.println();
		System.out.println("***Test 6: Seller Delete***");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted Complited!");
		sc.close();*/
	}

}
