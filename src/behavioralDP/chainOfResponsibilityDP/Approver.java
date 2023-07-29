package behavioralDP.chainOfResponsibilityDP;

public abstract class Approver {

    Approver cheif;

    // when we create obj we need to set the manager of class

    public Approver(Approver cheif){
        this.cheif = cheif;

    }
    abstract boolean approveLoan(int amount);
}
