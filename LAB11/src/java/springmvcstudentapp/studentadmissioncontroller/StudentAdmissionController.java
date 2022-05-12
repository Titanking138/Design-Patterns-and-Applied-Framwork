package springmvcstudentapp.studentadmissioncontroller;

import java.util.Date;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("unawme")
public class StudentAdmissionController {

    @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelView = new ModelAndView("AdmissionForm");
        return modelView;
    }

    @RequestMapping(value = "/submitAdmissionForm.html", method
            = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student stObj, BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView model = new ModelAndView("AdmissionForm");
            return model;
        }
        ModelAndView modelView = new ModelAndView("AdmissionSuccess");
        modelView.addObject("headermsg", "We have registered your details");
        modelView.addObject("uname", stObj.getStudentName());
        return modelView;
    }

    @ModelAttribute
    public void addingCommonObjects(Model model) {
        model.addAttribute("mainHeader", "Dharamsinh Desai University");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setDisallowedFields(new String[]{"studentMobile"});
    }
}
