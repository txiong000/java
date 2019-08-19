package snackbar;

public class Snack
{
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{	
		maxId++;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
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

	public int getQuantity()
	{
		return quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public int getVendingMachineId()
	{
		return vendingMachineId;
	}

	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}

	public void addQuantity(int addQuantity)
	{
		quantity = quantity + addQuantity;
	}

	public void buySnack(int buyAmount)
	{
		quantity = quantity - buyAmount;
	}

	public void totalCost(int quantity)
	{
		double totalAmount;
		totalAmount = quantity + cost;
	}

	@Override
	public String toString()
	{
		String rtnString =
		"id: " + id + "\n" 
		+ "name: " + name + "\n"
		+ "price: " + cost + "\n"
		+ "quantity: " + quantity;
		return rtnString;
	}
}