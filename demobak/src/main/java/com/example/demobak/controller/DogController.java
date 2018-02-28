/**
 * @author JiJG(jijg)
 * date:2018-02-28 15:34
 * describe:
 */
package com.example.demobak.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class DogController {
    //    @Value("${cupSize}")
//    private String cupSize;
//    @Value("${age}")
//    private Integer age;

    @Value("${content}")
    private String content;

    @RequestMapping(value = "/dog", method = RequestMethod.GET)
    public String say() {
        return content;
//        return "Hello ! I am Dog ,I LIKE cupSize:" + cupSize+",my age is:"+age;
    }

    @RequestMapping(value = "/dog/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id) {
        //http://localhost:8080/dog/1
        return "id:" + id;
//        id:1
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayId(@RequestParam("id") Integer MyId) {
        //http://localhost:8080/say?id=2
        return "MyId:" + MyId;
        //MyId:2
    }

    //默认值设置
    @RequestMapping(value = "/saydefault", method = RequestMethod.GET)
    public String sayIdDefault(@RequestParam(value = "id", required = false, defaultValue = "0") Integer MyId) {
        //http://localhost:8080/say?id=2
        return "MyId:" + MyId;
        //MyId:2
    }

    //
    @GetMapping(value = "/say_get")
    public String sayIdGet(@RequestParam(value = "id", required = false, defaultValue = "0") Integer MyId) {
        //http://localhost:8080/say?id=2
        return "GetMapping id:" + MyId;
        //MyId:2
    }

    @PostMapping(value = "/say_post")
    public String sayIPost(@RequestParam(value = "id", required = false, defaultValue = "0") Integer MyId) {
        //http://localhost:8080/say?id=2
        return "GetMapping id:" + MyId;
        //MyId:2
    }

}