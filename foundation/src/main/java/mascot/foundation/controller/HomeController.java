package mascot.foundation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to the Mascot Foundation API!</h1>";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String msg) {
        return "<h1>You said: " + msg + "</h1>";
    }

    @GetMapping("/calc")
    public String calc(@RequestParam int x, @RequestParam int y) {
        int result = x + y;
        return "<h1>Result: " + result + "</h1>";
    }
}
