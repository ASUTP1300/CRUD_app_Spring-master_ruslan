package web.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.models.User;
import web.service.UserService;
import web.service.UserServiceImpl;


public class MainTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);



         User user1 = new User();
         user1.setName("nora");
         user1.setLastName("lola");
         userService.add(user1);

    }
}
