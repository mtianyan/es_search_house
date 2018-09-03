package cn.mtianyan.entity;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.mtianyan.ApplicationTests;
import cn.mtianyan.repository.UserRepository;

/**
 * Created by 瓦力.
 */
public class UserRepositoryTest extends ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne() {
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali", user.getName());
    }
}
