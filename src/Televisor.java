class Televisor {
    String status;

    Televisor(){
        status = "OFF";
    }

    void turnOn(){
        status = "ON";
    }

    void turnOff(){
        status = "OFF";
    }

    void showStatus(){
        System.out.println("TV status: " + status);
    }
}
