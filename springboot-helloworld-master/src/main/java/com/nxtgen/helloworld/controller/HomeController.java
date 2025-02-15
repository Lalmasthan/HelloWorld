package com.nxtgen.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HomeController {

    @RequestMapping("/")
    String home() {
        
        try {
            // Local address
            String ip = InetAddress.getLocalHost().getHostAddress();
            String host = InetAddress.getLocalHost().getHostName();

            // Remote address
            String rip = InetAddress.getLoopbackAddress().getHostAddress();
            String rhost = InetAddress.getLoopbackAddress().getHostName();
            System.out.println("Hello from NextGen! --> V3. Local Server ip --> "+ip+ " Local Server Name --> "+host+" Remote Server ip --> "+rip+ " Remote Server Name --> "+rhost);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
        return "Hello from NextGen! --> V3. Local Server ip --> "+ip+ " Local Server Name --> "+host+" Remote Server ip --> "+rip+ " Remote Server Name --> "+rhost;
    }

}
