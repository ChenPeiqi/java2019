package chenpeiqi.lab1;

class Asus extends Mainboard {
    Asus() {
        this.setBrandName();
    }

    @Override
    public void setBrandName() {
        this.brandName = "Asus";
    }
}

class Gigabyte extends Mainboard{
    Gigabyte() {
        this.setBrandName();
    }

    @Override
    public void setBrandName() {
        this.brandName = "Gigabyte";
    }
}


abstract public class Mainboard extends Hardware{
    //mbps
    int speed;

    Mainboard(){
        this.setComponentName();
    }
    @Override
    public void setComponentName(){
        this.componentName = "mainboard";
    }

}
