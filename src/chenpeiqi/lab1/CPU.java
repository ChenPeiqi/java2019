package chenpeiqi.lab1;

class Intel extends CPU{
    Intel(){
        this.setBrandName();
    }
    @Override
    public void setBrandName(){
        this.brandName = "Intel";
    }
}

class AMD extends CPU{
    AMD(){
        this.setBrandName();
    }
    @Override
    public void setBrandName(){
        this.brandName = "AMD";
    }
}




abstract public class CPU extends Hardware{
        String coreNum;
        CPU(){
            this.setComponentName();
        }
    @Override
    public void setComponentName(){
        this.componentName = "CPU";
    }

}
