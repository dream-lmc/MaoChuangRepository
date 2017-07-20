import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/6/29.
 */

@Controller
public class TestController {

    @RequestMapping("/test.do")
    public String test() {
        return "success";
    }
}
