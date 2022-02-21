
package com.toadsdewin.testing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{   
    @RequestMapping("/main")
    public String messageDisplay()
    {
        return "¡Buenas tardes, este es mi primer mensaje en SpringBoot!";
    }
}
