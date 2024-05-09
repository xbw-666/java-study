import java.util.Scanner;

public class Puppy{
    int puppyAge;
    /*
   Scanner number1 = new Scanner(System.in);
   int number=number1.nextInt();
   ############
    */
    Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name );
    }

    void setAge( int age ){
        puppyAge = age;
    }

    void getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
    }

    public static void main(String[] args){
        /* 创建对象 */
        Scanner number1 = new Scanner(System.in);
        int number=number1.nextInt();
        Puppy myPuppy = new Puppy( "tommy" );
        /* 通过方法来设定age */
        myPuppy.setAge(number);
        /* 调用另一个方法获取age */
        myPuppy.getAge( );
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge );
    }
}
/*
java因强制要求类名（唯一的public类）和文件名统一，因此在引用其它类时无需显式声明。
在编译时，编译器会根据类名去寻找同名文件
#################
 */