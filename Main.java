public class Main{
    public static void main(String[] args) {
        GroceryStore gs1 = new GroceryStore( "Eddie's", 3523450.45, false );
        GroceryStore gs2 = new GroceryStore( "Giant 43", 4321090.65, true );
        System.out.println( gs1.toString() );
        System.out.println(" ");
        System.out.println( gs2.toString() );

        System.out.println(" ");
        System.out.println(gs1.annualTaxes());
        System.out.println(" ");
        System.out.println(gs2. annualTaxes());

    }
}
