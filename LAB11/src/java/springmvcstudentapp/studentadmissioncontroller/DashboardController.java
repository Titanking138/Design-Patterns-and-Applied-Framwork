package springmvcstudentapp.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("uname")
public class DashboardController {

    @RequestMapping(value = "/dashboard.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelView = new ModelAndView("Dashboard");
        return modelView;
    }
}
