package inheritance;

import java.util.Scanner;

class Person{
	private String name;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String bloodGroup;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
}

class Donor extends Person{
	private String bloodBankName;
	private String donorType;
	private String donationDate;
	public String getBloodBankName() {
		return bloodBankName;
	}
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}
	public String getDonorType() {
		return donorType;
	}
	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}
	public String getDonationDate() {
		return donationDate;
	}
	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}
	
	public void displayDonationDetails( )	{
		System.out.println("Donation Details :");
		System.out.println("Name : "+getName());
		System.out.println("Date Of Birth : " +getDateOfBirth());
		System.out.println("Gender : " +getGender());
		System.out.println("Mobile Number : " +getMobileNumber());
		System.out.println("Blood Group : " +getBloodGroup());
		System.out.println("Blood Bank Name : " +getBloodBankName());
		System.out.println("Donor Type : " +getDonorType());
		System.out.println("Donation Date : " +getDonationDate());
		
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
//		Person person=new Person();
		Donor donor=new Donor();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name :");
		String name=sc.nextLine();
		donor.setName(name);
		while(true) {
			System.out.println("Enter Date of Birth[dd-MM-yyyy] :");
			String dob=sc.nextLine();
			
			if(dob.length()==10)
			{
				donor.setDateOfBirth(dob);
				break;
			}	
			else {
				System.out.println("Type in [dd-MM-yyyy] fromat!Try again.");
				continue;
			}
			
			}
		
		System.out.println("Enter Gender :");
		String gender=sc.nextLine();
		donor.setGender(gender);
		while(true) {
		System.out.println("Enter Mobile Number :");
		String mobile=sc.nextLine();
			   if(mobile.length()==10) {
				   donor.setMobileNumber(mobile);
					break;
					}
			   else {
					System.out.println("Invalid number!Try again.");
					continue;
				}
			
		}	
					
		System.out.println("Enter Blood Group :");
		String bloodgroup=sc.nextLine();
		donor.setBloodGroup(bloodgroup);
		System.out.println("Enter Blood Bank Name :");
		String bankname=sc.nextLine();
		donor.setBloodBankName(bankname);
		System.out.println("Enter Donor Type :");
		String donortype=sc.nextLine();
		donor.setDonorType(donortype);
		while(true) {
			System.out.println("Enter Donation Date[dd-MM-yyyy] :");
			String donationdate=sc.nextLine();
			
			if(donationdate.length()==10)
			{
				donor.setDonationDate(donationdate);
				break;
			}	
			else {
				System.out.println("Type in [dd-MM-yyyy] fromat!Try again.");
				continue;
			}
			
			}
		
				
		donor.displayDonationDetails();
		
		
		

	}

}