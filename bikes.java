public class bikes {
	int year;
	String modelName;
	bikes(){
		System.out.println("bike is created");
	}
	bikes(int y,String n){
		year=y;
		modelName=n;
		System.out.println("Bike is created in year"+" "+year+" "+"and modelNAme is"+" "+modelName);
	}
	public static void main(String [] args){
		bikes b1=new bikes(2023,"honda");
		bikes b2=new bikes();
	}
	
}