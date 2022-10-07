class Pig implements Animal{
    public void animalSound(){
        System.out.println("pig Say : wawawawa");
    }
    public void sleep(){
        System.out.println("Zzzzzz");
    }
}

class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
