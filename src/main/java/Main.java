public class Main {

    public static void main(String args[]) {
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        iphone.displayRetina();
        samsung.displayAmoled();
        Retina retinaToAmoledAdapter = new RetinaToAmoledAdapter(samsung);
        retinaToAmoledAdapter.displayRetina();
    }

}
