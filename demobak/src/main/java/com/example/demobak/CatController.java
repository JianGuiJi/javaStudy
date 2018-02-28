/**
 * @author JiJG(jijg)
 * date:2018-02-28 15:40
 * describe:
 */
package com.example.demobak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CatController {
    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = {"/cat","/cat1"},method = RequestMethod.GET)
    public String say() {
//        return girlProperties.getCupSize();
        return "index";
    }
}
