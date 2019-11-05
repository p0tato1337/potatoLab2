package pl.example.spring.potatoLab2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

        import java.lang.reflect.Array;
        import java.time.LocalDateTime;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Date;
        import java.util.List;
        import java.util.concurrent.CopyOnWriteArrayList;
@RestController
@RequestMapping("/punkty")
public class PunktyController {

    private StudentService service=new StudentService();

    @RequestMapping("/hello")
    public String GetHello() {
        String data = LocalDateTime.now().toString();
        return "hello " + data;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getUsers()
    {
        return this.service.getStudents().asJava();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student addUser(@RequestBody NewStudent newStudent)
    {
        return this.service.addStudent(newStudent);
    }


}
//public class PunktyController{
//    private List<String> users=new CopyOnWriteArrayList<>();
//    {
//        this.users.addAll(Arrays.asList("student1","student2"));
//    }
//    @RequestMapping(value = "/users" ,method = RequestMethod.GET)
//    public List<String> getUsers(){
//        return this.users;
//    }
//    @RequestMapping(value = "/users",method = RequestMethod.POST)
//    public int addUser(@RequestBody String name){
//        this.users.add(name);
//        return this.users.size();
//    }
//}
//
