package chenpeiqi.lab1;
import java.util.Iterator;
import java.util.List;

public class ComputerStore {
    private List<Computer> computers = null;
    private int num_of_computer=0;

    ComputerStore(List<Computer> computers){
        this.computers = computers;
        Iterator it = computers.iterator();
        while(it.hasNext()){
            it.next();
            num_of_computer++;
        }
    }

    public void getStoreInfo(){
        Iterator it = this.computers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
