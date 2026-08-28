package encapsulation;

public class FoodDeliveryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodDelivery fd=new FoodDelivery();
		fd.setorderid(001);
		fd.setname("koteshwar");
		fd.setamount(45.87);
		fd.setstatus("Preparing");
		
		System.out.println(fd.getorderid());
		System.out.println(fd.getname());
		System.out.println(fd.getamount());
		System.out.println(fd.getstatus());
	}

}
