package com.youzhi.kkt.controller;


import com.youzhi.kkt.dao.StudentDao;
import com.youzhi.kkt.service.StudentService;
import com.youzhi.kkt.utils.ResultVOUtil;
import com.youzhi.kkt.vo.ResultVO;
import com.youzhi.kkt.vo.StudentLoadVO;
import com.youzhi.kkt.vo.StudentVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 考生
 */

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public ResultVO<StudentVO> list(@RequestParam Integer page) {
        List<StudentDao> list = studentService.findAll();

        StudentLoadVO studentLoadVO = new StudentLoadVO();

        List<StudentVO> studentVOS = new ArrayList<>();

        for(StudentDao studentDao: list) {
            StudentVO studentVO  = new StudentVO();
            BeanUtils.copyProperties(studentDao, studentVO);

            studentVO.setGroupName("默认");
            studentVOS.add(studentVO);
        }

        if ( page > 5) {
            studentLoadVO.setLoadEnd(true);
        } else {
            studentLoadVO.setLoadEnd(false);
        }
        studentLoadVO.setList(studentVOS);

        return ResultVOUtil.success(studentLoadVO);
    }
}
