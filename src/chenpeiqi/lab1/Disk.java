package chenpeiqi.lab1;

class Seagate extends Disk{
    Seagate(){
        this.setBrandName();
    }
    @Override
    public void setBrandName(){
        this.brandName = "Seagate";
    }
}

class WestDigitals extends Disk{
    WestDigitals(){
        this.setBrandName();
    }

    @Override
    public void setBrandName(){
        this.brandName = "WestDigitals";
    }
}



abstract public class Disk extends Hardware{
    //GB
    int volume;
    Disk(){
        this.setComponentName();
    }
    @Override
    public void setComponentName(){
        this.componentName = "disk";
    }

}
