package academy.learnprogramming.springbootdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("demo")
    public String demo() {

        log.info("demo method called");

        return "Hello Spring Boot!";
    }

    @GetMapping("welcome")
    public String welcome(Model model) {

        log.info("welcome method called");

        model.addAttribute("message", "Welcome to Spring Boot");

        return "welcome"; //endpoint wykona się, lecz widok nie wyświetli się w przeglądarce, co jest związane z wbudowanym w Intellij-a tomcatem
                          //a nie z naszym błędem. Błąd tomcata dotyczy jakiegoś zahardkodowanego adresu "/error", który w jakiś sposób kłóci się z jsp
    }
}
