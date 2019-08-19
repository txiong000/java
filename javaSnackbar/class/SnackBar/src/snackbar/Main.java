package snackbar;

public class Main
{
	public static void workWithData()
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		System.out.println("*** Customer Data ***");
		System.out.println(jane);
		System.out.println(bob);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		System.out.println("*** Vending Machine ***");

		System.out.println(food);
		System.out.println(drink);
		System.out.println(office);

		System.out.println("*** Snack ***");

		System.out.println("*** Vending Machine Food ***");
		Snack chips = new Snack("chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("chocolate bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("pretzel", 30, 2.00, food.getId());

		System.out.println("*** Vending Machine Drink ***");
		Snack soda = new Snack("soda", 24, 2.50, drink.getId());
		Snack water = new Snack("water", 20, 2.75, drink.getId());

		System.out.println(chips);
		System.out.println(chocolateBar);
		System.out.println(pretzel);
		System.out.println(soda);
		System.out.println(water);

		jane.buySnack(3, soda.getCost());
		soda.buySnack(3);
		System.out.println(jane.getCash());
		System.out.println(soda.getQuantity());

		jane.buySnack(1, pretzel.getCost());
		pretzel.buySnack(1);
		System.out.println(jane.getCash());
		System.out.println(pretzel.getQuantity());

	}


	public static void main(String[] args)
	{
		workWithData();
	}
}