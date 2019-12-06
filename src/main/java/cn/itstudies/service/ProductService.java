package cn.itstudies.service;

import cn.itstudies.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Farewell is well
 * @date 2019-12-03 15:08
 */
public interface ProductService {
    @RequestMapping("/message")
    String showMessage();
    @RequestMapping(value = "/message2")
    String showMessage2(@RequestParam("message") String message);
    @PostMapping(value = "/showUser")
    String showUser(@RequestBody User user);
}
