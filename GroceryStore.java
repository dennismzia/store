public class GroceryStore extends Store {
    double annualRevenues;
    boolean chain;


    public GroceryStore(String name,double annualRevenues, boolean chain){
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

