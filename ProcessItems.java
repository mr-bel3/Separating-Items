import java.util.ArrayList;


public class ProcessItems 
{

	public static void main(String[] args) 
	{
		ArrayList<Item> list = new ArrayList<Item>();

		ItemListMethods.populateArray("/Users/ABeltre/Documents/workspace/Lab03/objects.txt", list);
		ItemListMethods.displayItems(list);
	}

}
