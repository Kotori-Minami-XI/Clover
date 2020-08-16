package com.Kotori.test;

import com.Kotori.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/***
 *  测试Spring的注解注入
 */
public class UserTest {

    /***
     * 当UserService接口有两个以上实现，则必须要指定，有以下两种方法
     * 1.
     *     @Autowired
     *     @Qualifier("userServiceImpl1")
     *
     * 2.
     *     @Resource (type = com.Kotori.service.UserServiceImpl2.class)
     *
     * 3.
     *     @Resource (name = "userServiceImpl2")
     */
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserController userController = (UserController)context.getBean("userController");
        userController.deleteUser();
    }

}
