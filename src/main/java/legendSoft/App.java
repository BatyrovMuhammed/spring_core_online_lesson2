package legendSoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Gadget laptop1 = context.getBean("laptop", Gadget.class);
//        laptop1.battery();
        Gadget phone = context.getBean("phone", Phone.class);
//        phone.battery();

        Store store = context.getBean("store",Store.class);
        System.out.println(store);

        context.close();

    }
}
