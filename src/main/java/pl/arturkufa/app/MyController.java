package pl.arturkufa.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class MyController {

    @Value("${cmdLineArgument:null}")
    String arg;

    @Value("${envVar:null}")
    String envVar;

    @GetMapping("/")
    String index() {
        return "index page";
    }

    @GetMapping("/hello")
    String hello() {
        try {
            return "[Canary]Hello from: " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "Something went wrong: " + e;
        }
    }

    @GetMapping("/cmd-arg")
    String cmdArg() {
        return "Env arg1="+arg;
    }

    @GetMapping("/env-var")
    String envVar() {
        return "Env var1="+envVar;
    }

}
