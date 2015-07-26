package cn.fmachine.web.action;

import cn.fmachine.base.action.BaseAction;
import cn.fmachine.entity.HouseUser;
import cn.fmachine.service.IUserService;
import cn.fmachine.service.impl.UserServiceImpl;
import cn.fmachine.util.Constant;

import java.util.Map;

/**
 * UserAction
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 7/24/15
 */
public class UserAction extends BaseAction {
    private IUserService iUserService = new UserServiceImpl();

    private HouseUser user;
    private Object msg;

    /**
     * login
     *
     * @return
     */
    public String login() {
        if (user != null) {
            Map<String, Object> map = iUserService.login(user);
            user = (HouseUser) map.get("user");
            if (user != null) {
                session.put(Constant.LOGIN_USER, user);
                msg = "true";

                return SUCCESS;
            } else {
                msg = map.get("msg");
            }
        }
        return LOGIN;
    }

    /**
     * logout
     */
    public String logout() {

        session.remove(Constant.LOGIN_USER);
        return "house.manage";
    }

    public String doSearch() {
        return LOGIN;
    }

    public IUserService getiUserService() {
        return iUserService;
    }

    public void setiUserService(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    public HouseUser getUser() {
        return user;
    }

    public void setUser(HouseUser user) {
        this.user = user;
    }

    public Object getMsg() {
        return msg;
    }

    public void setMsg(Object msg) {
        this.msg = msg;
    }
}
