package cn.fmachine.service.impl;

import cn.fmachine.dao.IUserDAO;
import cn.fmachine.dao.impl.UserDAOImpl;
import cn.fmachine.entity.HouseUser;
import cn.fmachine.service.IUserService;
import com.sun.org.apache.regexp.internal.REUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserServiceImpl
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 7/23/15
 */
public class UserServiceImpl implements IUserService {
    private IUserDAO iUserDAO = new UserDAOImpl();

    @Override
    public Map<String, Object> login(HouseUser user) {
        Map<String, Object> result = new HashMap<String, Object>();
        List list = iUserDAO.findByProperty("HouseUser", "username", user
                .getUsername());
        if (list != null && list.size() > 0) {
            HouseUser loginUser = (HouseUser) list.get(0);
            if (user.getPassword() != null && user.getPassword().trim()
                    .equals(loginUser.getPassword())) {
                result.put("user", loginUser);
                return result;
            } else {
                // prompt : user name and password not match.
                result.put("msg", "user name and password don't match.");
            }
        } else {
            // prompt : user not existed.
            result.put("msg", "user does not exist.");
        }
        return result;
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
