package application;	
		
		import java.sql.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

		public class Program2 {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
				
				/*System.out.println("=== TEST 1: seller findById =====");
				Seller seller = sellerDao.findById(3);
				System.out.println(seller);
				*/
				/*System.out.println("\n=== TEST 2: seller findByDepartment =====");
				Department department = new Department(2, null);
				List<Seller> list = sellerDao.findByDepartment(department);
				for(Seller obj : list) {
					System.out.println(obj);
				}
				*/
				/*System.out.println("\n=== TEST 3: seller findAll =====");
				list = sellerDao.findAll();
				for(Seller obj : list) {
					System.out.println(obj);
				}
				*/
				System.out.println("\n=== TEST 4: seller insert =====");
				
				Department department = new Department(8, "Musica");
				departmentDao.insert(department);
				System.out.println("Inserted! New id = " + department.getId());
				
				/*System.out.println("\n=== TEST 5: seller update =====");
				seller = sellerDao.findById(6);
				seller.setId(9);
				sellerDao.update(seller);
				System.out.println("Update completed");
				
				System.out.println("\n=== TEST 6: seller delete =====");
				System.out.println("digite um id para deletar");
				int id = sc.nextInt();
				sellerDao.deletteById(id);
				System.out.println("Deletado!");
				*/
			sc.close();
			
			}

	}
