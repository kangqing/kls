package com.kls.gitdemo;

import cn.hutool.core.util.ReUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author kangqing
 * @since 2023/11/22 22:21
 */
@SpringBootTest
public class PattenTest {

    @Test
    void test() {
        final boolean foooood = ReUtil.isMatch("^[a-zA-Z0-9]{3}$", "1H");
        System.out.println(foooood);
    }

    /**
     * equals比内存地址，但是String类重写了，所以比的是值
     */
    @Test
    void testEquals() {
        String a = new String("123");
        String b = "123";

        System.out.println(a.equals(b));
    }
}
