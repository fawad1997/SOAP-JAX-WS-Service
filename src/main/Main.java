package main;

import ws.DemoImplementation;

import javax.jws.*;
import javax.xml.ws.*;

public class Main {
    public static void main(String[] args){
        try{
            Endpoint.publish("http://localhost:4789/ws/demo",new DemoImplementation());
            System.out.println("Service Created");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
