public class EtsySearch {
    public static void main(String[] args) {
        navigateToEtsy();
        searchForWoodenSpoon();
        printResults();
     /*
        navigateToEtsy();
        searchForWoodenSpoon();
        printResults();

        "wooden spoon" (14,720 Results)

        create above 3 methods and call them in the main method.
         */
    }
    private static void navigateToEtsy() {
        System.out.println("Launch Chrome browser");
        System.out.println("Navigate to www.etsy.com");
    }
        private static void searchForWoodenSpoon() {

            System.out.println("Type 'Wooden spoon' into search field");
            System.out.println("Click on search button");
    }
    private static void printResults() {

        System.out.println("Wooden spoon (17,420 Results)");
    }
}
