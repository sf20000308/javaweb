import java.util.*;

//点菜的主程序
public class DishApp {
//
    static List<Dish> dishList=new ArrayList<>();
    //吃饭用户点的
    static List<Dish> personDish=new ArrayList<>();
    public static void main(String[] args){
        //先初始化菜品
        initDish();
        //小饭店就会做5个菜
        //创建扫描器对象，获取到控制台输入的内容
        Scanner s=new Scanner(System.in);
        System.out.print("请输入编号");
    //给用户展示主菜单

       //获取内容

        while(true){
            //给用户展示菜单
            showMenu();
            //获取内容
            int num =s.nextInt();
            switch (num){
                case 1:
                    while (true){
                    //把饭店菜单展示给用户就ok
                showDishMenu();
                //获取用户输入的内容
                        int id=s.nextInt();
                    if (id==0){
                        break;
                    }
                 //从饭店的集合中获取到菜品的对象12345
                        //集合的索引：01234
                        Dish dish=dishList.get(id-1);
                        System.out.println("亲,您点了："+dish.name+"菜");
                        //用户点一个，存储一个
                        personDish.add(dish);
                    }
                break;
                case 2:
                    //展示用户已经点的菜品

                    showPersonDish();
                    break;
                case 3:
                    //买单
                    buy();
                    return;
            }
        }
    }
    public static void Num1(){

    }
    //展示饭店菜单
    public static void showDishMenu(){
        System.out.println("---请您点菜---");
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish=dishList.get(i);
            System.out.println(dish.id+"\t"+dish.name+"\t"+dish.price);
        }
        System.out.println("---输入序号点菜，按0返回上一级---");
    }
    //客户已点
    public static void showPersonDish(){
        System.out.println("----您已点的菜品---");
        for (Dish dish:personDish){
            System.out.println(dish.id+"\t"+dish.name+"\t"+dish.price);
        }
    }
    //买单

    public static void buy(){
        System.out.println("---请稍等，正在结算---");
        //定义总金额
        double total=0f;
        //遍历已经点的菜品
        for (Dish dish :personDish){
            total +=dish.price;
        }
        System.out.println("亲，您本次共消费了："+total+"元");
    }
    public static void showMenu(){
        System.out.println("----主菜单----");
        System.out.println("菜单\t\t\t 1");
        System.out.println("已点菜品\t\t 2");
        System.out.println("买单\t\t\t 3");
        System.out.println("----根据编号请选择服务----");
    }
    public static  void initDish(){
        Dish dish=new Dish(1,"鱼香肉丝",29.0);
        dishList.add(dish);
        Dish dish2=new Dish(2,"炖王八",59.0);
    dishList.add(dish2);
//存放菜品
    dishList.add(new Dish(3,"家常凉菜",21.0));
        dishList.add(new Dish(4,"地三鲜",24.0));
        dishList.add(new Dish(5,"油焖大虾",35.0));
    }

}
//单件点多个，删除