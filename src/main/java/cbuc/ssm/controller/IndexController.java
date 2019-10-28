package cbuc.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: Cbuc-SSMTemp
 * @Package: cbuc.ssm.bean
 * @ClassName: IndexController
 * @ClassDesp: 主控制类
 * @Author: Cbuc
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "test";
    }
}
