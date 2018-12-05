package com.bewicode.mybatisplusdemo.sys.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bewicode.mybatisplusdemo.sys.entity.User;
import com.bewicode.mybatisplusdemo.sys.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserServiceTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        //Assert.assertEquals(5, userList.size());
        Assert.assertTrue(userList.size() > 0);

        User u = new User();
        u.setAccount("xxxx");
        u.setName("xxxx");
        userMapper.insert(u);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name","xxxx");
        User u2 = userMapper.selectOne(queryWrapper);

        Assert.assertNotNull(u2);


        userList.forEach(System.out::println);
    }

}