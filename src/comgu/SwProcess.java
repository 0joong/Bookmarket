package comgu;

public class SwProcess {
    public int PID;
    public int execTime;

    public SwProcess(int PID, int execTime) {
        this.PID = PID;
        this.execTime = execTime;
    }
    @Override
    public String toString() {
        return "SwProcess [PID=" + PID + ", execTime=" + execTime + "]";
    }
}
