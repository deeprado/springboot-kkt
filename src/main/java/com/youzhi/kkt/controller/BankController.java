package com.youzhi.kkt.controller;


import com.youzhi.kkt.dao.BankDao;
import com.youzhi.kkt.service.BankService;
import com.youzhi.kkt.utils.ResultVOUtil;
import com.youzhi.kkt.vo.BankVO;
import com.youzhi.kkt.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 题库
 */


@RestController
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/list")
    public ResultVO<BankVO> list() {
        List<BankDao> bankDaos = bankService.findAll();
        List<BankVO> bankVOS = new ArrayList<>();
        for(BankDao bankDao : bankDaos) {
            BankVO bankVO = new BankVO();
//            bankVO.setBankId(bankDao.getBankId());
//            bankVO.setTitle(bankDao.getTitle());
//            bankVO.setDescription(bankDao.getDescription());
            BeanUtils.copyProperties(bankDao, bankVO);
            bankVOS.add(bankVO);
        }
//        System.out.println(bankVOS);
        return ResultVOUtil.success(bankVOS);
    }
}
