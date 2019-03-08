package chenpeiqi.lab1;



abstract public class Hardware implements ComponentFunc,BrandSet{
    String componentName;
    String brandName;
    float price;
    @Override
    public void work(){
        System.out.println(this.componentName+"work");
    }
}
