package life.majiang.community.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class CustomizeErrorController implements ErrorController {
    /*
    * P35 后三分之一段
    * 未做，ErrorController类与视频中的不一样，怀疑是spring或springboot版本问题
    */
}
