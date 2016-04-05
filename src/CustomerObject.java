
public class CustomerObject {
	//private long customerID;
	private String full_name;
	private String dob;
	private String postCode;
	private String addressln1;
	private String addressln2;
	private String addressln3;
	
	public CustomerObject(String full_name, String dob, String postCode, String addressln1, 
			String addressln2, String addressln3) {
		this.full_name = full_name;
		this.dob = dob;
		this.postCode = postCode;
		this.addressln1 = addressln1;
		this.addressln2 = addressln2;
		this.addressln3 = addressln3;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPostcode() {
		return postCode;
	}

	public void setPostcode(String postcode) {
		this.postCode = postCode;
	}

	public String getAddressln1() {
		return addressln1;
	}

	public void setAddressln1(String addressln1) {
		this.addressln1 = addressln1;
	}

	public String getAddressln2() {
		return addressln2;
	}

	public void setAddressln2(String addressln2) {
		this.addressln2 = addressln2;
	}

	public String getAddressln3() {
		return addressln3;
	}

	public void setAddressln3(String addressln3) {
		this.addressln3 = addressln3;
	}
}
