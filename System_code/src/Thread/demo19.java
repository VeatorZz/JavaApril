package Thread;
//单例模式  饿汉

class Singleton{
    private static Singleton instance =new Singleton();
//static静态实际效果和字面含义没有任何关联关系!!!
    public static Singleton getInstance(){
        return instance;
    }//构造方法设为私有!其他的类型来new不就行了
    private  Singleton(){}

}
class Singletonlazy {
    //这里没有创建实例
    volatile private static Singletonlazy instance = null;

    //首次调用getinstance才会创建实例
    public static Singletonlazy getInstance() {
        if (instance == null) {
            synchronized (Singletonlazy.class) {
                if (instance == null) {
                    instance = new Singletonlazy();
                }

            }

        }
        return instance;
    }


    private  Singletonlazy(){

    }
}
public class demo19 {
    public static void main(String[] args) {
        Singleton instance =Singleton.getInstance();
        Singleton instance2 =Singleton.getInstance();
        System.out.println(instance2==instance);
    }
}
