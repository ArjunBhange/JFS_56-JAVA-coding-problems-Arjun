package polymorphism;

public class Movie {

	public int bookticket(int ticket) {
		return 200*ticket;
	}
	public int bookticket(int ticket,boolean premium) {
		if(premium) {
			return 350*ticket;
		}
		return 200*ticket;
	}
	public double bookticket(int ticket,boolean premium,double discount) {
		double dis;
		if(premium) {
			dis = (350*ticket) * (discount/100);
			 return  350*ticket - dis;
		}else {
			dis = (200*ticket) * (discount/100);
			return (200*ticket) - dis;
		}
		
		
	}

}
