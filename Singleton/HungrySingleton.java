//优点:事先创建好一个静态实例,,线程安全
//缺点:无论要不要用到这个实例,都会被创建到(不能延时加载)
public class HungrySingleton{
    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}