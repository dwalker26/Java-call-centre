import java.util.ArrayList;

public class LocalDataStore {
	private ArrayList<CustomerObject> customerlist = new ArrayList<CustomerObject>();
	private static LocalDataStore localDataStore = new LocalDataStore();
	
	private LocalDataStore()
	{
		customerlist.add(new CustomerObject("David Walker", "12/02/1993", "CR78FF", " 3 Goulding Gardens", "Thornton Heath", "London"));
	}
	
	public static LocalDataStore getLocalDataStore()
	{
		return localDataStore;
	}
	
	public void addcustomer(CustomerObject customerdetails1)
	{
		customerlist.add(customerdetails1);
	}
	
	public CustomerObject findCustomer(String name, String postCode){
		for(CustomerObject customer : customerlist)
		{
			if(customer.getFull_name().equalsIgnoreCase(name) && customer.getPostcode().equalsIgnoreCase(postCode))
			{
				System.out.println("Customer Found");
				
				return null;
			}
			else
			{
				System.out.println("Customer not found");
				return customer; 
			}
			
		}
		return null;
	}
}
