package application;

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
		List<Seller> listAll = sellerDao.findAll();
		
		for (Seller obj : listAll) {
			System.out.println(obj.toString());
		}

	}

}
