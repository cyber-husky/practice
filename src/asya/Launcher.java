package asya;

public class Launcher {

    private Service service = ServiceImpl.getServiceInstance();

    private void launch() {
        service.doWork();
    }

    public static void main(String[] args) {
        new Launcher().launch();
    }
}
