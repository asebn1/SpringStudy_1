package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // MVC
    @GetMapping("hello")   //hello라는 url로 갔을 때 실행. http://localhost:8080/hello
    public String hello(Model model){
        model.addAttribute("data", "HELLO! 바뀐값이다~");  // 앞(원래값), 뒤(치환값)
        return "hello";  // hello.html을 변환 후 넘겨줌
    }

    // MVC
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);  // http://localhost:8080/hello-mvc?name=spring!
        return "hello-template";
    }

    // API
    @GetMapping("hello-spring")
    @ResponseBody  // HTTP body에 직접 값을 넣어주겠다는 것
    public String helloString(@RequestParam("name") String name){ // http://localhost:8080/hello-spring?name=spring!
        return "hello " + name; // "hello spring"
    }

    //JSON
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){  // http://localhost:8080/hello-api?name=spring!
        Hello hello = new Hello();
        hello.setName(name);
        return hello;  // {"name":"spring!"}
    }
    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
