package pl.arturkufa.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class MyController {

    @GetMapping("/hello")
    String hello() {
        try {
            return "[Canary]Hello from: " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "Something went wrong: " + e;
        }
    }
}
