package ObjectOriented;

@interface Kakumirizi{
	String name () default " ";
	String email () default " ";
}
@Kakumirizi (name = "Kakumirizi Daud",
	email = "dkakumirzii@gmail.com")
public class Programming {
	static String continent;
	static 
	{
		continent = "Africa, the mother land";
		System.out.println(continent);
	}
	/**
	 * this class is excuted by creating an object in the main method
	 *
	 * */
	public  static void flip()
	{
		StringBuffer sb = new StringBuffer("Software ");
		sb.append("Engineering");
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		
		Programming.flip();
		
	}
}
