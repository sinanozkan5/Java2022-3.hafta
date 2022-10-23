package staticDemo;

public class ProductManager {
	
	public void add(Product prodcut) {
		if(ProductValidator.isValid(prodcut)) {
			System.out.println("Eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
	}	
}