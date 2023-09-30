package legendSoft;

import org.springframework.stereotype.Component;

@Component("laptop")
public class Laptop implements Gadget{

    @Override
    public void battery() {
        System.out.println("Laptop has a 98% battery");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
