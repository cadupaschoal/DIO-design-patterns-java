package one.digitalinnovation.gof.singleton;

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            //noinspection InstantiationOfUtilityClass
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
