package polymorphism;



public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie();
		System.out.println(m.bookticket(4));
		System.out.println(m.bookticket(4,true));
		System.out.println(m.bookticket(5,true,25.0));
	}

}
