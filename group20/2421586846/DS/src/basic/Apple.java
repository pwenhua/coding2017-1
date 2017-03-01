package basic;

public class Apple extends Fruit{
	String Name ="Apple";
	String Type = "Three";
	
	public String getName(){		
		//return super.getClass().getName();
			return Name;
	}
	
	public String GetType()
	{
		return "Three";
	}
	
	public String OnlyApple()
	{
		return "OnlyApple";
	}
	public void SetName(String newName){
		Name = newName;
	}
}
