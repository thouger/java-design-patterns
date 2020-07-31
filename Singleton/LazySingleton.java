//优点:线程安全,可延时加载
//缺点:每次访问时都要同步，会影响性能，且消耗更多的资源
class LazySingleton {
    private static volatile LazySingleton instance =null;
    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}