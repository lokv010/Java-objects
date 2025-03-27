package effectiveJava;

public class singleton {
    private static singleton instance;

    //instance is not dependant of the object of this class singleton
    //it will only return the object instance of singleton
    public static singleton getInstance(){
        return instance;
    }
    
//checking if the instance is already created.
    public static singleton getInstancAdvanced(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;
    }
//static intialization is already thread safe
    //using statif factory method
    private singleton(){}
    public static singleton getInstanceStaticMethod(){
        return instance;
    }

    //prevent serialization issue
    private Object readResolve(){
        return instance;
    } 

    //lazy initialization of instance
    private static class holder{
    static final singleton instance1=new singleton();
    }
    public static singleton getLazyInstance(){
        return holder.instance1;
    }
}
