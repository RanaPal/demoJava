
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
	 * @author Apal
	 *
	 */
public class TestDataEncapPerson{
	public static  int personId=0;
	public static String Address="444 Sunset Av., Florida";
	public static String phone="201-564-9999";
	public static String pName="Manny";
	public static HashMap<String,String>  hmap=  new HashMap<String,String>();
	public  static void main(String[] args) {
		int x[]= {32,2,5454,25};
String s2=Arrays.toString(x);
 	System.out.println("String  "+s2);
		for(int y:x)			
		System.out.println(y);
		
//		System.out.println(pName.substring(0,1));
		 Person s1=new Person();	
		 for (int i=0;i<9;i++) {                                                           //  creating a test data set
		s1.setNameId(pName+"-"+i,personId++); // All the attributes of the person class is Encapsulated only can be accessed by setter and getter methode
		s1.setAddrs(Address+"-"+i);
		s1.setPhno(phone.substring(0,11)+i);
		s1.viewPersonInfo();
		 }
	}
	
}
