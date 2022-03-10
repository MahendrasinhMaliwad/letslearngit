package company.Training;
class base{ 
	int x ;
	public static void printme() {
		System.out.println("i am constructor");
	}
}
public class inherit extends base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base messege = new base();
        System.out.println(messege);
       
	}

}
