public class food{
	private int Id;
	private String Name;
	private double Price;
	
	public food(){}
	public food(int Id,String Name,double Price){
		this.setId(Id);
		this.Name = Name;
		this.Price = Price;
		}
	
	public int getId(){
		return this.Id;
	}
	
	public void setId(int Id){
		this.Id = Id;
	}	
		
	public void setName() {
      this.Name = Name;
     }
    public void setPrice() {
      this.Price = Price;
     }
	
		
	public String getName() {
    return this.Name;
    }
	public double getPrice() {
    return this.Price;
    }
	
	public void showDetails(){
		System.out.println("Food Id no: " + this.getId());
		System.out.println("Food Name: "  + this.getName());
		System.out.println("Food price: " + this.getPrice());
	}
	
	
}