package day_25_Arrays;

public class Shopping {
    public static void main(String[] args) {
        String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks"};
        int[] prices = {120, 5, 150, 3000, 6};
        int[] itemId = {12345, 12346, 12347, 12348, 12349};
        //print count of products
        System.out.println("Product count: " + products.length);

        //check if products, prices and itemIds have some count
        if (products.length == prices.length && products.length == itemId.length) {
            System.out.println("Shopping list looks good");
        } else {
            System.out.println("Something is wrong in the list");
        }

        //loop though products and print each one in separate line
        for (String str : products) {
            System.out.println(str);
        }
        //prices ==> for loop
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        //itemId ==> print this in reverse order
        for (int idx = itemId.length - 1; idx >= 0; idx--) {
            System.out.println(itemId[idx]);
        }
        System.out.println("###############################");
        //print a report with total price
        //Item 1: 12345 - Timberland Shoes - 120/0
        //.......
        //Total price:
        double totalPrice = 0.0;
        for (int h = 0; h < products.length; h++) {
            System.out.println("Item " + (h + 1) + " : " + itemId[h] + " - " + products[h] + " - $" + prices[h]);
            totalPrice += prices[h];
        }
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        //Find the most expensive item in the list and print it as a report
        //loop and find. Do not use Array class
        int maxIndex = 0;
        int maxPrice = 0;

        for (int a = 0; a < prices.length; a++) {
            if (prices[a] > maxPrice) {
                maxPrice = prices[a];
                maxIndex = a;
            }
        }
        System.out.println(itemId[maxIndex] + " - " + products[maxIndex] + " - $" + maxPrice);
        System.out.println("###################################");
        
        int minPrice = Integer.MAX_VALUE;
        for(int b = 0; b < prices.length; b++) {
            if (prices[b] < minPrice) {
                minPrice = prices[b];
            }
        }
        System.out.println("Min price: "+minPrice);

    }
}
