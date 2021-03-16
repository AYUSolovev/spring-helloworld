import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld HWBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat CBean1 = (Cat) applicationContext.getBean("cat");
        Cat CBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(HWBean));
        System.out.println(CBean1.equals(CBean2));
    }
}