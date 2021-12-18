package OOP;

public class Abstraction2 extends Abstraction{
    @Override
    void go(){
        System.out.println("I can go!!!");
    }

    private String model;
    private int years;
    private int count;

    // Encapulation 
    Abstraction2(String model, int years,int count){
        this.setCount(count);
        this.setModel(model);
        this.setYears(years);
    }

    public String getmodel(){
        return model;
    }
    public int getyears(){
        return years;
    }
    public int count(){
        return count;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYears(int years){
        this.years = years;
    }
    public void setCount(int Count){
        this.count = Count;
    }
    public void copy(Abstraction2 x){
        this.setCount(x.count);
        this.setModel(x.model);
        this.setYears(x.years);
    }
}
