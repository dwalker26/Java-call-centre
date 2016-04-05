import java.util.Scanner;


public class Customer {
	public static String acceptCustomerInput()
	{
		String customerFirstName;
		String customerLastName;
		String postCode;
		String addressln1;
		String addressln2;
		String addressln3;
		String productName;
		Boolean porousware = false;
		String YesorNo;
		
		Scanner customerInput = new Scanner(System.in);
		System.out.println("Please enter customer first name: ");
		customerFirstName = customerInput.nextLine();
		//System.out.println("Customer First Name  = " + customerFirstName);
		
		System.out.println("Please enter customer last name: ");
		customerLastName = customerInput.nextLine();
		//System.out.println("Customer Last Name  = " + customerLastName);
		
		String dob;
		System.out.println("Please enter your Date of Birth: ");
		dob = customerInput.nextLine();
		
		System.out.println("Please enter customer postcode: ");
		postCode = customerInput.nextLine();
		//System.out.println("Customer Post Code  = " + postCode);
		 
		System.out.println("Please enter the first line of your address: ");
		addressln1 = customerInput.nextLine();
		 
		System.out.println("Please enter the second line of your address: ");
		addressln2 = customerInput.nextLine();
		
		System.out.println("Please enter the third line of your address: ");
		addressln3 = customerInput.nextLine();
		
		System.out.println("Please enter the product the customer wants to buy: ");
		productName = customerInput.next();
		//System.out.println("Customer Product  = " + productName);
				
		System.out.println("Does the customer want porousware?: ");
		YesorNo = customerInput.next();
		
		CustomerObject customerdeets = new CustomerObject(customerFirstName + " " + customerLastName, dob, 
					   postCode, addressln1, addressln2, addressln3);
		
		
		
		if (YesorNo == "yes");
		{
			porousware = true;
		}
		
		
		return productName;
	}
		
}

