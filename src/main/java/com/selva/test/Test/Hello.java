package com.selva.test.Test;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author manoj.bardhan
 *
 */
@Controller
@EnableAutoConfiguration
public class Hello {
@RequestMapping("/hello")
@ResponseBody
public String sayHello() {
return "Hello World Developer!!!";
}


@RequestMapping("/hello1")
@ResponseBody
public String sayHello1(@RequestParam("id") String personId) {
return "Hello "+personId+". Welcome for  testing!!!";
}

@RequestMapping(value = "/hello2/{personId}", method = RequestMethod.GET)
@ResponseBody

public String sayHello2(@PathVariable String personId) {
return "Hello "+personId+". Welcome for  testing!!!";
}



}