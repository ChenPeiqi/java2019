package chenpeiqi.lab1;

class Samsung extends RAM{
    Samsung(){
        this.setBrandName();
    }
    @Override
    public void setBrandName(){
        this.brandName = "Samsung";
    }
}


class Kingston extends RAM{
    Kingston(){
        this.setBrandName();
    }
    @Override
    public void setBrandName(){
        this.brandName = "Kingston";
    }
}


abstract public class RAM extends Hardware{
    //MB
    int volume;

    RAM(){
        this.setComponentName();
    }
    @Override
    public void setComponentName(){
        this.componentName = "RAM";
    }

}
