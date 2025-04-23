package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class ContainerController {

    @GetMapping("/health")
    public String getHealthController() {
        return "Health is fine";
    }

    // @GetMapping("/best-container")
    // public String getBestContainer() {
    //     Container container = new Container(1, new Dimension(10.0, 20.0, 30.0), Container.ContainerType.SMALL);
    //     return container.toString();
    // }
}