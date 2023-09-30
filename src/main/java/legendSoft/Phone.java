package legendSoft;

import org.springframework.stereotype.Component;

@Component("phone")
public class Phone implements Gadget{

    @Override
    public void battery() {
        System.out.println("Phone has a 34% battery");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
