package asya;

public class ServiceImpl implements Service {

    private static Service serviceInstance;

    private AuxService auxService;

    private ServiceImpl() {
        this.auxService = AuxServiceImpl.getAuxServiceInstance();
    }

    public static Service getServiceInstance() {
        if (serviceInstance == null) {
            serviceInstance = new ServiceImpl();
        }
        return serviceInstance;
    }

    @Override
    public void doWork() {
        auxService.doAuxWork();
        System.out.println("Hello, Asya!");
    }
}
