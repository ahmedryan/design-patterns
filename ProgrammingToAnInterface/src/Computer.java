public class Computer {
    IDisplayModule dm;

    public void setDisplayModule(IDisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }
}
