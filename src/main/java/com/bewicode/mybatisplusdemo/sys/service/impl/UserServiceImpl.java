package com.bewicode.mybatisplusdemo.sys.service.impl;

import com.bewicode.mybatisplusdemo.sys.entity.User;
import com.bewicode.mybatisplusdemo.sys.mapper.UserMapper;
import com.bewicode.mybatisplusdemo.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author hongxubing
 * @since 2018-12-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
