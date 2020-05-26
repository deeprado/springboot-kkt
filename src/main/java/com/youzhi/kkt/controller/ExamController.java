package com.youzhi.kkt.controller;

import com.youzhi.kkt.dao.ExamDao;
import com.youzhi.kkt.service.ExamService;
import com.youzhi.kkt.utils.ResultVOUtil;
import com.youzhi.kkt.vo.ExamVO;
import com.youzhi.kkt.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 考试
 */

@RestController
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    private ExamService examService;

    @GetMapping("/list")
    public ResultVO<ExamVO> list() {

        List<ExamDao> list = examService.findAll();
        List<ExamVO> examVOS = new ArrayList<>();

        for(ExamDao examDao : list) {
            ExamVO examVO = new ExamVO();
            BeanUtils.copyProperties(examDao, examVO);
            examVOS.add(examVO);
        }

        return ResultVOUtil.success(examVOS);
    }
}
