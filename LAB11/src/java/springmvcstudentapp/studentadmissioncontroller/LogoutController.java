package springmvcstudentapp.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("uname")
public class LogoutController {

    @RequestMapping("/logout.html")
    public ModelAndView logout(SessionStatus status) {
        status.setComplete();
        ModelAndView modelView = new ModelAndView("Logout");
        return modelView;
    }
}
