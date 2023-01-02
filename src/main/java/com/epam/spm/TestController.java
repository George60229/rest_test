package com.epam.spm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
    @GetMapping("/test")
    public void getAllCertificates() {

    }
}
