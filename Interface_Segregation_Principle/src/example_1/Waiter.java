package example_1;

class Waiter implements Worker {

    @Override
    public void work() {
        System.out.println("Deliver food");
    }
}