
public class Item 
{
	private String name;
	private String price;
	private String quantity;
	
	public Item(String n, String p, String q)
	{
		name = n;
		price = p;
		quantity = q;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	
	public void setPrice(String p)
	{
		price = p;
	}
	public String getPrice()
	{
		return price;
	}
	
	public void setQuantity(String q)
	{
		quantity = q;
	}
	public String getQuantity()
	{
		return quantity;
	}

	@Override
	public String toString() {
		return name + ", " + price + ", " + quantity + "";
	}
	

}
