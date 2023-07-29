package behavioralDP.chainOfResponsibilityDP;

public class Manager extends Approver{

    public Manager(Approver cheif) {
        super(cheif);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 500) {
            System.out.println("Bank Manager approved");
            System.out.println("*********************");
        } else if (cheif != null) {
            System.out.println("Requested amount exceeds limit that officer can approve. Please send to general manager.");
            return cheif.approveLoan(amount);

        }
        return false;
    }
}
