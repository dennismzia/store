class Store{
    final double SALES_TAX_RATE = 0.6;
    String name;

    Store(String name){
        this.setName(name);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return("Stores name: "+this.getName());
    }
}


class GroceryStore extends Store {
    double annualRevenues;
    boolean chain;


    GroceryStore(String name,double annualRevenues, boolean chain){
        super(name);
        this.setAnnualRevenues(annualRevenues);
        this.setChain(chain);

    }

    public void setAnnualRevenues(double annualRevenues){
        if (annualRevenues < 0){
        this.annualRevenues = annualRevenues;
    }else{
        this.annualRevenues = annualRevenues;
    }
    }

    public void setChain(boolean chain){
        this.chain = chain;
    }

    public double getAnnualRevenues(){
        return this.annualRevenues;
    }

    public boolean getChain(){
        return chain;
    }

    // @Override public String toString();
    public String toString(){
        return("store name: " + super.getName() + "\n annualreveue: "+ this.getAnnualRevenues() +"\n is part of chain: "+this.getChain());

    }
    public double annualTaxes(){
        return (super.SALES_TAX_RATE * this.getAnnualRevenues());
    }
    }

public class StoreTest{
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
