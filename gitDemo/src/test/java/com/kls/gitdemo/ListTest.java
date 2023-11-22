package com.kls.gitdemo;

import com.kls.gitdemo.entity.User;
import lombok.Data;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kangqing
 * @since 2023/11/12 21:57
 */
@SpringBootTest
public class ListTest {

    private static List<User> list;


    @BeforeAll
    public static void init() {
        list = new ArrayList<>();
        list.add(new User("1", "孙尚香", "20", "ssx@qq.com", "1"));
        list.add(new User("2", "刘备", "30", "lb@qq.com", "0"));
        list.add(new User("3", "曹操", "35", "cc@qq.com", "0"));
        list.add(new User("4", "孙权", "25", "sq@qq.com", "0"));
        list.add(new User("5", "李白", "30", "lb@qq.com", "0"));
    }

    @Test
    void test() {
        // 找出年龄大于30岁的人输出打印
        int a;
        for(a = 0; a < list.size(); a++){
            if( Integer.parseInt(list.get(a).getAge()) > 30 ){
                System.out.println(list.get(a));
            }
        }

        // 找出邮箱是 lb@qq.com 的输出打印
        Map<String, User> map = new HashMap<String, User>();
        for(a = 0; a < list.size(); a++){
            if("lb@qq.com".equals(list.get(a).getEmail())){
                map.put(list.get(a).getId(), list.get(a));
            }
        }
        for(String key : map.keySet()){
            User value = map.get(key);
            System.out.println(value);
        }
    }

    @Test
    void list() {
        List<Cat> list = new ArrayList<>();
        final Cat cat = new Cat();
        cat.setId(1);
        cat.setName("1");
        list.add(cat);
        cat.setName("2");
        list.add(cat);
        list.forEach(System.out::println);

    }

    @Data
    class Cat {
        private Integer id;
        private String name;
    }
}
