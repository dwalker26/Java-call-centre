import java.util.Scanner;

public class Login {
	public static void main(String[] args)
	{
		int EmployeeID;
		double price;
		String full_name;
		String postcode;
		
		/*String nameofProduct;
		int Quantity;*/
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your Employee ID: ");
		
		EmployeeID = userInput.nextInt();
		System.out.println("EmployeeID = " + EmployeeID);
		
		price = productInfo();
		System.out.println("Price: " + price);
		
	    LocalDataStore.getLocalDataStore().findCustomer("David Walker", "CR78FF");
	    
	}
	
	public static double productInfo()
	{
		double price = 0.0;
		String nameofProduct;
		int Quantity;		

		Customer customerproductdetails = new Customer();
		nameofProduct = customerproductdetails.acceptCustomerInput();
		
		Customerdetails productQuantity = new Customerdetails();
		
		Quantity = productQuantity.takeCustomerInput();
		
		if (nameofProduct.equalsIgnoreCase("jacuzzi"))
		{
			Product jacuzzi = new Product("jacuzzi", 100, 695.50);
			System.out.println("New product: " + jacuzzi.name);
			
			jacuzzi.quantity = jacuzzi.quantity - Quantity;	
			price = jacuzzi.price;
			System.out.println("Jacuzzi Quantity: " + jacuzzi.quantity);
		}
		else
		
			if (nameofProduct.equalsIgnoreCase("Gnome"))
			{
				Product Gnome = new Product("Gnome", 100, 15.00);
				System.out.println("New product: " + Gnome.name);
			
				Gnome.quantity = Gnome.quantity - Quantity;	
				price = Gnome.price;
			}
			else
		
				if (nameofProduct.equalsIgnoreCase("Lawnmower"))
				{
					Product lawnmower = new Product("lawnmower", 100, 100.00);
					System.out.println("New product: " + lawnmower.name);
			
					lawnmower.quantity = lawnmower.quantity - Quantity;
					price = lawnmower.price;
				}
				else
				{
					System.out.println("Product not in catalogue");
				}
		
		return price;
	}
}

