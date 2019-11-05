package pl.example.spring.potatoLab2;
import io.vavr.collection.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentServiceTest {
    @Test
    public void getEmptyList() {
        final StudentService service=new StudentService();
        List<Student> students = service.getStudents();
        assertTrue((students.isEmpty()));
    }
    @Test
    public void addStudent() {
        final StudentService service = new StudentService();
        final Student created=service.addStudent(new NewStudent("Student1","1-2-3","IP"));
        assertNotNull(created);
    }
    @Test
    public void addStudentIsReturned() {
        final StudentService service = new StudentService();
        final Student created=service.addStudent(new NewStudent("Student1","1-2-3","IP"));
        final List<Student> all = service.getStudents();
        assertEquals("Student1",all.get(0).name);
    }
    @Test
    public void addStudentHasNewId() {
        final StudentService service = new StudentService();
        final Student created1 = service.addStudent(new NewStudent("Test1", "1", "IP"));
        final Student created2 = service.addStudent(new NewStudent("Test2", "2", "IP"));
        assertEquals(2, service.getStudents().size());
        assertNotEquals(created1.id, created2.id);
    }}