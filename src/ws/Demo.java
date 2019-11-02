package ws;

import javax.jws.*;
@WebService
public interface Demo {
    @WebMethod
    public String helloWorld();
    @WebMethod
    public String hi(String fullName);
}
