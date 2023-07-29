package behavioralDP.mediatorDP;

public class MessageRunner {

    public static void main(String[] args) {

        MessageRunner runner = new MessageRunner();
        runner.mediator();
    }

    void mediator(){
        // dispatcher object
        MessageDispatcher dispatcher = new MessageDispatcher();

        Expert chemistryExpert = new MessageExpert("ChemistryExpert", dispatcher);
        Expert mathExpert = new MessageExpert("MathExpert", dispatcher);
        Expert biologyExpert = new MessageExpert("BiologyExpert", dispatcher);

        dispatcher.register("chemistry", chemistryExpert);
        dispatcher.register("mathematics", mathExpert);
        dispatcher.register("biology", biologyExpert);

        chemistryExpert.sendMessage("mathematics","Message about Math");
        biologyExpert.sendMessage("biology", "Message about Biology");
        chemistryExpert.sendMessage("chemistry", "Message about Chemistry");

}
}
