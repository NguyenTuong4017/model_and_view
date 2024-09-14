package handlinglists.handlinglists.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import handlinglists.handlinglists.domain.Student;

@Controller
public class StudentController {
    @RequestMapping("/hello")
    public String helloStudents(Model model) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Aubrey", "Graham");
        Student student2 = new Student("Kendrick", "Lamar");
        Student student3 = new Student("Marshall", "Mathers");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        model.addAttribute("student", studentList);

        return "hello";

    }
}
