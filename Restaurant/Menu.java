import java.util.Scanner;

class RestaurantMenu 
{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        // Storing prices and discounts on varoius items
        double price_of_burger = 45.0;
        double discount_on_burger = 10.0;
        double price_of_pasta = 70.0;
        double discount_on_pasta = 25.0;
        double price_of_coffee = 30.0;
        double discount_on_coffee = 15.0;

        // Displaying the Menu
        System.out.println("Item\tPrice\tDiscount(%)");
        System.out.println("-------------------------------------------");
        System.out.println("Burger\t"+ price_of_burger +"\t"+discount_on_burger);
        System.out.println("Pasta\t"+ price_of_pasta +"\t"+discount_on_pasta);
        System.out.println("Coffee\t"+ price_of_coffee +"\t"+discount_on_coffee);
        // Taking user input
        System.out.println("Enter the quantity of each item");
        System.out.print("Burgers - ");
        int quantity_burger = sc.nextInt();
        System.out.print("Pasta - ");
        int quantity_pasta = sc.nextInt();
        System.out.print("Coffee - ");
        int quantity_coffee = sc.nextInt();

        // Calculating cost
        double total_cost_burger = quantity_burger * price_of_burger;
        double total_cost_pasta = quantity_pasta * price_of_pasta;
        double total_cost_coffee = quantity_coffee * price_of_coffee;

        // Calculating discount
        double burger_with_discount = (total_cost_burger * discount_on_burger)/100;
        double pasta_with_discount = (total_cost_pasta * discount_on_pasta)/100;
        double coffee_with_discount = (total_cost_coffee * discount_on_coffee)/100;

        // Final Cost
        double final_cost_burger = total_cost_burger - burger_with_discount;
        double final_cost_pasta = total_cost_pasta - pasta_with_discount;
        double final_cost_coffee = total_cost_coffee - coffee_with_discount;
        double final_cost = final_cost_burger + final_cost_coffee + final_cost_pasta;

        // Displaying the bill
        System.out.println("Item\tPrice\tQuantity Discount(%)\tTotal");
        System.out.println("---------------------------------------------------------------------------");
        if(final_cost_burger > 0)
            System.out.println("Burger\t"+price_of_burger+"\t"+quantity_burger+"\t"+discount_on_burger+"\t\t"+final_cost_burger);
        if(final_cost_pasta > 0)
            System.out.println("Pasta\t"+price_of_pasta+"\t"+quantity_pasta+"\t"+discount_on_pasta+"\t\t"+final_cost_pasta);
        if(final_cost_coffee > 0)
            System.out.println("Coffee\t"+price_of_coffee+"\t"+quantity_coffee+"\t"+discount_on_coffee+"\t\t"+final_cost_coffee);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Please pay\t\t\t\t"+final_cost);

        sc.close();
    }
}

