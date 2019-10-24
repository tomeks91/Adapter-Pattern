public class RetinaToAmoledAdapter implements Retina {
    private final Amoled amoled;

    public RetinaToAmoledAdapter(Amoled amoled) {
        this.amoled = amoled;
    }

    @Override
    public void displayRetina() {
        this.amoled.displayAmoled();
    }
}
