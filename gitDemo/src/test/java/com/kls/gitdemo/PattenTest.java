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
}
