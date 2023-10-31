package cus;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Customers{
	  
	public static void main(String[] args) {
		List<CustomerDetails> cusList=new ArrayList<>();
		createList(cusList);
		
		//List of customer details who are belongs to Hyderabad location
		List<CustomerDetails> list=cusList.stream().filter(cus->cus.getCity().equals("Hyderabad")).collect(Collectors.toList());
		System.out.println("Belongs to Hyderabad location  \n"+list);
	
		
		//List of customer details on state wise
		Map<String, List<CustomerDetails>> cus=cusList.stream().collect(Collectors.groupingBy(CustomerDetails::getState));
		System.out.println("\ncustomer details on state wise");
		cus.forEach((key,value)->System.out.println("State - "+key+" [Details - "+value+"]"));
	    
		
	    //List of customer details who has max and min balance amount.
	    Optional<CustomerDetails> maxAmount=cusList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(CustomerDetails::getBalance)));
	    System.out.println("\nMax balance amount\n  "+maxAmount);
	    Optional<CustomerDetails> minAmount=cusList.stream().collect(Collectors.minBy(Comparator.comparingDouble(CustomerDetails::getBalance)));
	    System.out.println("\nMin balance amount\n  "+minAmount);
	    
	    
	    //List of customer details in sorting order based on date of birth.
	    List<CustomerDetails> sortedList = cusList.stream().sorted(Comparator.comparing(CustomerDetails::getDob)).collect(Collectors.toList());
        System.out.println("\nCustomer details in sorting order based on date of birth : ");
        sortedList.forEach(sl->System.out.println(sl));
        
        //List of customer details in sorting order based on Balance.
        List<CustomerDetails> Amount = cusList.stream().sorted(Comparator.comparing(CustomerDetails::getBalance).reversed()).collect(Collectors.toList());
        System.out.println("\nCustomer details in sorting order based on Balance : ");
        Amount.forEach(A->System.out.println(A));
        
        //List of customer details who has n'th highest balanced amount.
        Scanner n=new Scanner(System.in);
        System.out.println("\nEnter n'th value : ");
        long num=n.nextLong();
        System.out.println("Customer details who has highest balanced amount in "+num+" position");
        List<CustomerDetails> highestBalance=cusList.stream().sorted(Comparator.comparingDouble(CustomerDetails::getBalance).reversed()).skip(num-1).limit(1).collect(Collectors.toList());
		highestBalance.forEach(System.out::println);;
        
}
	public static void createList(List<CustomerDetails> customerDetails){
		CustomerDetails c1=new CustomerDetails();
		
		c1.setId("1");
		c1.setName("Rama");
		c1.setAddress("uv468");
		c1.setCity("Delhi");
		c1.setState("Delhi");
		c1.setPincode(1234);
		c1.setEmailid("rama@123");
		c1.setBalance(987500);
		c1.setAcctnumber(123456788);
		c1.setMobnum(979993278);
		c1.setGender("Female");
		c1.setTitle("job");
		c1.setRemarks("Need more details");
		c1.setProfession("student");
		c1.setDob(LocalDate.of(2001, Month.APRIL, 24));
		
		CustomerDetails c2=new CustomerDetails();
		c2.setId("2");
		c2.setName("jyothi");
		c2.setAddress("ab468");
		c2.setCity("banglore");
		c2.setState("karnataka");
		c2.setPincode(6789);
		c2.setEmailid("jyothi@123");
		c2.setBalance(3500);
		c2.setAcctnumber(87843757);
		c2.setMobnum(565645768);
		c2.setGender("Female");
		c2.setTitle("course");
		c2.setRemarks("Need more details");
		c2.setProfession("Teacher");
		c2.setDob(LocalDate.of(1998, Month.MARCH, 21));
		
		CustomerDetails c3=new CustomerDetails();
		c3.setId("3");
		c3.setName("Rupesh");
		c3.setAddress("uv468");
		c3.setCity("chennai");
		c3.setState("Tamilnadu");
		c3.setPincode(1234);
		c3.setEmailid("rupesh@123");
		c3.setBalance(34500);
		c3.setAcctnumber(364837658);
		c3.setMobnum(98978732);
		c3.setGender("male");
		c3.setTitle("job");
		c3.setRemarks("Need more details");
		c3.setProfession("student");
		c3.setDob(LocalDate.of(2011, Month.JUNE, 16));
		
		
		CustomerDetails c4=new CustomerDetails();
		c4.setId("4");
		c4.setName("suguna");
		c4.setAddress("uv468");
		c4.setCity("kadapa");
		c4.setState("Ap");
		c4.setPincode(1234);
		c4.setEmailid("suguna@123");
		c4.setBalance(34500);
		c4.setAcctnumber(985743898);
		c4.setMobnum(93423278);
		c4.setGender("Female");
		c4.setTitle("job");
		c4.setRemarks("Need more details");
		c4.setProfession("student");
		c4.setDob(LocalDate.of(2004, Month.APRIL, 14));
		
		
		CustomerDetails c5=new CustomerDetails();
		c5.setId("5");
		c5.setName("subbarayudu");
		c5.setAddress("uv468");
		c5.setCity("tirupathi");
		c5.setState("Ap");
		c5.setPincode(1234);
		c5.setEmailid("subbarayudu@123");
		c5.setBalance(209800);
		c5.setAcctnumber(874932867);
		c5.setMobnum(988943278);
		c5.setGender("male");
		c5.setTitle("job");
		c5.setRemarks("Need more details");
		c5.setProfession("student");
		c5.setDob(LocalDate.of(2000, Month.JANUARY, 6));
		
		CustomerDetails c6=new CustomerDetails();
		c6.setId("6");
		c6.setName("manju");
		c6.setAddress("u96u68");
		c6.setCity("Banglore");
		c6.setState("karnataka");
		c6.setPincode(1234);
		c6.setEmailid("manju@123");
		c6.setBalance(344560);
		c6.setAcctnumber(97819788);
		c6.setMobnum(96732278);
		c6.setGender("Female");
		c6.setTitle("job");
		c6.setRemarks("Need more details");
		c6.setProfession("student");
		c6.setDob(LocalDate.of(2003, Month.SEPTEMBER, 19));
		
		
		CustomerDetails c7=new CustomerDetails();
		c7.setId("7");
		c7.setName("guru");
		c7.setAddress("utt68");
		c7.setCity("chennai");
		c7.setState("Tamilnadu");
		c7.setPincode(1234);
		c7.setEmailid("guru@123");
		c7.setBalance(567800);
		c7.setAcctnumber(98989898);
		c7.setMobnum(98456788);
		c7.setGender("male");
		c7.setTitle("job");
		c7.setRemarks("Need more details");
		c7.setProfession("student");
		c7.setDob(LocalDate.of(2000, Month.APRIL, 30));
		
		
		CustomerDetails c8=new CustomerDetails();
		c8.setId("8");
		c8.setName("krishna");
		c8.setAddress("uuf68");
		c8.setCity("kadapa");
		c8.setState("Ap");
		c8.setPincode(1234);
		c8.setEmailid("krishna@123");
		c8.setBalance(234900);
		c8.setAcctnumber(980807878);
		c8.setMobnum(985341257);
		c8.setGender("male");
		c8.setTitle("job");
		c8.setRemarks("Need more details");
		c8.setProfession("student");
		c8.setDob(LocalDate.of(2013, Month.FEBRUARY, 17));
		
		
		CustomerDetails c9=new CustomerDetails();
		c9.setId("9");
		c9.setName("lakshmi");
		c9.setAddress("jk68");
		c9.setCity("Chennai");
		c9.setState("Tamilnadu");
		c9.setPincode(1234);
		c9.setEmailid("lakshmi@123");
		c9.setBalance(987650);
		c9.setAcctnumber(978943688);
		c9.setMobnum(938643278);
		c9.setGender("Female");
		c9.setTitle("job");
		c9.setRemarks("change details");
		c9.setProfession("student");
		c9.setDob(LocalDate.of(2002, Month.NOVEMBER, 2));
		
		
		CustomerDetails c10=new CustomerDetails();
		c10.setId("10");
		c10.setName("devi");
		c10.setAddress("uv468");
		c10.setCity("Hyderabad");
		c10.setState("Telengana");
		c10.setPincode(16784);
		c10.setEmailid("devi@123");
		c10.setBalance(4900);
		c10.setAcctnumber(743928654);
		c10.setMobnum(987651238);
		c10.setGender("Female");
		c10.setTitle("job");
		c10.setRemarks("Need more details");
		c10.setProfession("student");
		c10.setDob(LocalDate.of(2006, Month.APRIL, 29));
		
		customerDetails.add(c1);
		customerDetails.add(c2);
		customerDetails.add(c3);
		customerDetails.add(c4);
		customerDetails.add(c5);
		customerDetails.add(c6);
		customerDetails.add(c7);
		customerDetails.add(c8);
		customerDetails.add(c9);
		customerDetails.add(c10);
}
		
		
		

}

