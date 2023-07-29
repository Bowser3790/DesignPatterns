package behavioralDP.chainOfResponsibilityDP;

public class Officer extends Approver{

    public Officer(Approver cheif) {
        super(cheif);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount < 100) {
            System.out.println("Bank officer approved");
            System.out.println("*********************");
        } else if (cheif != null) {
            System.out.println("Requested amount exceeds limit that officer can approve. Please send to manager.");
            return cheif.approveLoan(amount);

        }
        return false;
    }
}
