class TelevisorTest {
    public static void main (String[] args){
        Televisor televisor = new Televisor();

        televisor.showStatus(); //TV status: OFF
        televisor.turnOn();
        televisor.showStatus(); //TV status: ON
        televisor.turnOff();
        televisor.showStatus(); //TV status: OFF

    }
}