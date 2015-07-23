package cn.fmachine.service.impl;

import cn.fmachine.entity.HouseUser;
import cn.fmachine.service.IUserService;

import java.util.Map;

/**
 * UserServiceImpl 
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 7/23/15
 */public class UserServiceImpl implements IUserService {
    @Override
    public Map<String, Object> login(HouseUser user) {
        return null;
    }

    @Override
    public boolean doRegister(HouseUser user) {
        return false;
    }

    @Override
    public boolean validate(String name) {
        return false;
    }

    @Override
    public HouseUser getUserById(Integer id) {
        return null;
    }
}
