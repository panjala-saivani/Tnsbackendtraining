 class FlowersMain {
    // variables
    static class Flowers {
        String type;
        String colour;
//method
        void start() {
            System.out.println("The rose is red");
        }
    }
//excuter class
    public static void main(String[] args) {
        //create object
        Flowers f = new Flowers();
        f.type = "rose";
        f.colour = "red";
        f.start();
    }
}