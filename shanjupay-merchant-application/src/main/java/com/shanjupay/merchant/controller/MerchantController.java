package com.shanjupay.merchant.controller;

import com.shanjupay.merchant.api.MerchantService;
import com.shanjupay.merchant.api.dto.MerchantDTO;
import com.shanjupay.merchant.api.vo.MerchantRegisterVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author liuqiang
 * @version 1.0
 **/
@Slf4j
@RestController
@Api(value = "商户平台应用接口", tags = "商户平台应用接口", description = "商户平台应用接口")
public class MerchantController {

    @org.apache.dubbo.config.annotation.Reference
    MerchantService merchantService;
//    @org.apache.dubbo.config.annotation.Reference
//    private SmsService smsService;

    @ApiOperation(value = "根据id查询商户信息")
    @GetMapping("/merchants/{id}")
    public MerchantDTO queryMerchantById(@PathVariable("id") Long id) {
        return merchantService.queryMerchantById(id);
    }


    @ApiOperation("测试")
    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @ApiOperation("测试")
    @ApiImplicitParam(name = "name", value = "姓名", required = true, dataType = "string")
    @PostMapping(value = "/hi")
    public String hi(String name) {
        return "hi," + name;
    }

//    @ApiOperation("获取手机验证码")
//    @ApiImplicitParam(name = "phone", value = "手机号", required = true, dataType = "String",
//            paramType = "query")
//    @GetMapping("/sms")
//    public String getSMSCode(@RequestParam String phone) {
//        log.info("向手机号:{}发送验证码", phone);
//        return smsService.sendMsg(phone);
//    }
//
//    @ApiOperation("注册商户")
//    @ApiImplicitParam(name = "merchantRegister", value = "注册信息", required = true, dataType =
//            "MerchantRegisterVO", paramType = "body")
//    @PostMapping("/merchants/register")
//    public MerchantRegisterVO registerMerchant(@RequestBody MerchantRegisterVO merchantRegister) {
//        //校验验证码
//        smsService.checkVerifiyCode(merchantRegister.getVerifiykey(), merchantRegister.getVerifiyCode());
//        //注册商户
//        MerchantDTO merchantDTO = new MerchantDTO();
//        merchantDTO.setUsername(merchantRegister.getUsername());
//        merchantDTO.setMobile(merchantRegister.getMobile());
//        merchantDTO.setPassword(merchantRegister.getPassword());
//        merchantService.createMerchant(merchantDTO);
//        return merchantRegister;
//    }
}
