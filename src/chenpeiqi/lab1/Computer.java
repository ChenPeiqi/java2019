package chenpeiqi.lab1;

public class Computer {

    private String computerName;
    private float price=0;
    private int num_of_part=0;

    private CPU cpu = null;
    private RAM ram = null;
    private Disk disk = null;
    private Mainboard mainboard = null;

    Computer(String computerName,RAM ram, Disk disk,Mainboard mainboard){
        this.computerName=computerName;
        num_of_part=3;
        this.cpu = new CPU() {
            @Override
            public void setBrandName() {
                this.brandName="";
            }
        };
        this.ram=ram;
        this.disk=disk;
        this.mainboard=mainboard;
        this.price+=cpu.price+ ram.price+disk.price+mainboard.price;
    }
    Computer(String computerName, CPU cpu, Disk disk,Mainboard mainboard){
        this.computerName=computerName;
        num_of_part=3;
        this.cpu=cpu;
        this.ram = new RAM() {
            @Override
            public void setBrandName() {
                this.brandName="";
            }
        };
        this.disk=disk;
        this.mainboard=mainboard;
        this.price+=cpu.price+ disk.price+mainboard.price;
    }
    Computer(String computerName, CPU cpu, RAM ram, Mainboard mainboard){
        this.computerName=computerName;
        num_of_part=3;
        this.cpu=cpu;
        this.ram=ram;
        this.disk = new Disk() {
            @Override
            public void setBrandName() {
                this.brandName="";
            }
        };
        this.mainboard=mainboard;
        this.price+=cpu.price+ ram.price+mainboard.price;
    }
    Computer(String computerName, CPU cpu, RAM ram, Disk disk){
        this.computerName=computerName;
        num_of_part=3;
        this.cpu=cpu;
        this.ram=ram;
        this.disk=disk;
        this.mainboard = new Mainboard() {
            @Override
            public void setBrandName() {
                this.brandName="";
            }
        };
        this.price+=cpu.price+ ram.price+disk.price;
    }
    Computer(String computerName, CPU cpu, RAM ram, Disk disk,Mainboard mainboard){
        this.computerName=computerName;
        num_of_part=4;
        this.cpu=cpu;
        this.ram=ram;
        this.disk=disk;
        this.mainboard=mainboard;
        this.price+=cpu.price+ ram.price+disk.price+mainboard.price;
    }

    @Override
    public String toString() {
        return "ComputerName is :"+ this.computerName+";\n"
                +"Price is: "+ this.price+";\n"
                +"Has "+this.cpu.brandName+" "+ this.ram.brandName+" "
                +this.disk.brandName+" "+ this.mainboard.brandName+";\n\n";
    }
}
