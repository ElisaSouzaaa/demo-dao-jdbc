package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import model.impl.SellerDaoJDBC;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department obg = new Department(1,"books");
        Seller seller = new Seller(22,"Bob","bob@gmail.com",new Date(), 3000.0, obg);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obg);
        System.out.println(seller);
    }
}
