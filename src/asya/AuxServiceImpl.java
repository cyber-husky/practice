package asya;

public class AuxServiceImpl implements AuxService {

    private static AuxService auxServiceInstance;

    private AuxServiceImpl() {
    }


    public static AuxService getAuxServiceInstance() {
        if (auxServiceInstance == null) {
           auxServiceInstance = new AuxServiceImpl();
        }
        return auxServiceInstance;
    }

    @Override
    public void doAuxWork() {
        System.out.println("Hello, i've done the AUX work!");
    }
}
