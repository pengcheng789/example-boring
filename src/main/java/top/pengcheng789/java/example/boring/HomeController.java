package top.pengcheng789.java.example.boring;

import top.pengcheng789.java.boring.annotation.Action;
import top.pengcheng789.java.boring.annotation.Controller;
import top.pengcheng789.java.boring.bean.Data;
import top.pengcheng789.java.boring.bean.Param;
import top.pengcheng789.java.boring.bean.View;
import top.pengcheng789.java.boring.util.StringUtil;

/**
 * @author pen
 */
@Controller
public class HomeController {

    @Action(method = Action.RequestMethod.GET, path = "/")
    public Data index() {
        Data<String> data = new Data<>();
        data.setModel("Hello World!");

        return data;
    }

    @Action(method = Action.RequestMethod.GET, path = "/home")
    public View home() {
        View view = new View("home");

        return view;
    }
}
