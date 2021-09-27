import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld oneMoreBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(oneMoreBean.getMessage());

        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());
        Cat catMoreBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catMoreBean.getName());

        System.out.println(bean == oneMoreBean);      //true
        System.out.println(catBean == catMoreBean);   //false
    }
}