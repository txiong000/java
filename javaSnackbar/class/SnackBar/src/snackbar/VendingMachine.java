package snackbar;

public class VendingMachine
{	
	private static int maxId = 0;
	private String name;
	private int id;

	public VendingMachine(String name)
	{
		maxId++;
		this.name = name;
		id = maxId;

	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		String rtnStr = "VendingMachine: " + name + "\n"
		+ "id: " + id;
		return rtnStr;
	}

}