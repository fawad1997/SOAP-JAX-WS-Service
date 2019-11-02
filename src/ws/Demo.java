package ws;

import javax.jws.*;
public interface Demo {
    @WebMethod
    public String helloWorld();
    @WebMethod
    public String hi(String fullName);
}
