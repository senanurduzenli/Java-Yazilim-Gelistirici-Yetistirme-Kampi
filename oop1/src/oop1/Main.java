package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		// set
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmemne2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bilmemne3.jpg");
		
		
		Product[] products = {product1, product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Sena");
		individualCustomer.setLastName("Düzen");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("1111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	}

}
