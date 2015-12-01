import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ItemListMethods 
{
	public static void populateArray(String csvFile, ArrayList<Item> itemArray )
	{
		Scanner scan = null;
		try
		{
			File text = new File(csvFile);
			scan = new Scanner(new FileReader(text));
			
			String line = "";
			
			while(scan.hasNextLine())
			{
				line = scan.nextLine();
				String[] elements = line.split(",");
				
				if(line.length() > 4)
				{
					String name = elements[0].replaceAll(",", ";");
					String price = elements[1].replaceAll(",", ";");
					String quantity = elements[2].replaceAll(",", ";");
					
					itemArray.add(new Item(name, price, quantity));
				}	
			}
			scan.close();
		}
		catch(IOException x)
		{
			System.out.println(x);
		}
		
		return;
	}

	public static void displayItems(ArrayList<Item> list)
	{
		for(int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
