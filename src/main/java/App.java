import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW1.getMessage());

        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean(Cat.class);
        Cat beanCat2 = (Cat) applicationContext.getBean(Cat.class);

        System.out.println(beanCat1.getMessage());
        System.out.println(beanHW1.equals(beanHW2));
        System.out.println(beanCat1.equals(beanCat2));
    }
}