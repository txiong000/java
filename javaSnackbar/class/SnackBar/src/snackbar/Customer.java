package snackbar;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCash()
	{
		return cash;
	}

	public void buySnack(int qty, double prc)
	{
		int quantity = qty;
		double price = prc;
		double totalCost;
		totalCost = quantity * price;

		cash = cash - totalCost;
	}

	public void addCash(double newCash)
	{
		cash = cash + newCash;
	}

	@Override
	public String toString()
	{
		String rtnStr = "id: " + id + "\n"
		+ "name: " + name + "\n"
		+ "cash: " + cash;

		return rtnStr;
	}
}