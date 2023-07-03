import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CourseDetails cd = context.getBean("coursedetails", CourseDetails.class);
        System.out.println(cd.getProgrammeName());
        System.out.println(cd.getPrice());
        System.out.println(cd.getDuration());
        context.close();
    }
}
