package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findByid(3);
		
		System.out.println("***Test 1: Find By ID***");
		System.out.println(seller);
		System.out.println();
		
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
	}

}
