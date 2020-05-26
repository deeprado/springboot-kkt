package com.youzhi.kkt.controller;

import com.youzhi.kkt.dao.UserDao;
import com.youzhi.kkt.service.UserService;
import com.youzhi.kkt.utils.ResultVOUtil;
import com.youzhi.kkt.vo.ResultVO;
import com.youzhi.kkt.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证
 */

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultVO<UserVO> login(@RequestBody UserDao userDao) {

        UserDao user = userService.findByUsername(userDao.getUsername());
        if (user != null  && user.getPassword() == userDao.getPassword()) {
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            return ResultVOUtil.success(userVO);
        }
        return ResultVOUtil.error(user);
    }

    @PostMapping("/register")
    public ResultVO<UserVO> register(@RequestBody UserDao userDao) {
        UserDao user = userService.findByUsername(userDao.getUsername());
        if (user == null) {
            user = userService.insert(userDao.getUsername(), userDao.getPassword());
            return ResultVOUtil.success(user);
        } else {
            return ResultVOUtil.error(user);
        }
    }
}
