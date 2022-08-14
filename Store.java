public class Store{
    final double SALES_TAX_RATE = 0.6;
    String name;

    public Store(String name){
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
