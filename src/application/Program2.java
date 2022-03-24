package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		Department dep = depDao.findByid(2);
		
		System.out.println("***Test 1: Find By ID***");
		System.out.println(dep);
		System.out.println();
		/*
		System.out.println("***Test 2: Find By Departmen***");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj.toString());
		}
		System.out.println();
		System.out.println("***Test 3: Find All***");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println();
		System.out.println("***Test 4: Seller Insert***");
		Seller newSeller = new Seller(null, "Marney", "Marney@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+ newSeller.getId());
		
		System.out.println();
		System.out.println("***Test 5: Seller Update***");
		seller = sellerDao.findByid(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("Updated Complited!");
		
		System.out.println();
		System.out.println("***Test 6: Seller Delete***");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted Complited!");
		sc.close();*/
	}

}
