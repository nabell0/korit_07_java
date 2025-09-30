package test;

public class Factory {
    private static String factoryName;

    private Factory(){

    }
   public static String getInstance(){
        if(factoryName == null){
            factoryName = new Factory().toString();
        }
        return factoryName;
   }

    public static void main(String[] args) {
        String instance1 = Factory.getInstance();
        String instance2 = Factory.getInstance();
        String instance3 = Factory.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println(instance1 == instance3);
    }
}