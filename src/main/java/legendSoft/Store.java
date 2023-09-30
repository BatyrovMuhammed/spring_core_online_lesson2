package legendSoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("store")
public class Store {

    private Gadget gadget;

    @Value("${name}")
    private String name;

    @Value("${price}")
    private String price;

    @Autowired
    public Store(@Qualifier("phone") Gadget gadget) {
        this.gadget = gadget;
    }

    public Store(Gadget gadget, String name, String price) {
        this.gadget = gadget;
        this.name = name;
        this.price = price;
    }

    @PostConstruct
     void initMethod(){
        System.out.println("INIT METHOD");
    }
    @PreDestroy
    void destroyMethod(){
        System.out.println("Destroy METHOD");
    }

    public Gadget getGadget() {
        return gadget;
    }

    public void setGadget(Gadget gadget) {
        this.gadget = gadget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Store{" +
                "gadget=" + gadget +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
