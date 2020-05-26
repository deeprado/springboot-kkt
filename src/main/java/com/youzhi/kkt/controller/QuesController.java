package com.youzhi.kkt.controller;

import com.youzhi.kkt.dao.QuesDao;
import com.youzhi.kkt.service.QuesService;
import com.youzhi.kkt.utils.ResultVOUtil;
import com.youzhi.kkt.vo.QuesVO;
import com.youzhi.kkt.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 考题
 */

@RestController
@RequestMapping("/ques")
public class QuesController {

    @Autowired
    private QuesService quesService;

    @GetMapping("/list")
    public ResultVO<QuesVO> list() {
        List<QuesDao> list = quesService.findAll();

        List<QuesVO> quesVOS = new ArrayList<>();

        for(QuesDao quesDao: list) {
            QuesVO quesVO = new QuesVO();
            BeanUtils.copyProperties(quesDao, quesVO);
            quesVOS.add(quesVO);
        }
        return ResultVOUtil.success(quesVOS);
    }
}
