package com.shanjupay.merchant.service;

import com.shanjupay.merchant.api.MerchantService;
import com.shanjupay.merchant.api.dto.MerchantDTO;
import com.shanjupay.merchant.convert.MerchantConvert;
import com.shanjupay.merchant.entity.Merchant;
import com.shanjupay.merchant.mapper.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liuqiang.
 */
@org.apache.dubbo.config.annotation.Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public MerchantDTO queryMerchantById(Long id) {
        Merchant merchant = merchantMapper.selectById(id);
//        MerchantDTO merchantDTO = new MerchantDTO();
//        merchantDTO.setId(merchant.getId());
//        merchantDTO.setMerchantName(merchant.getMerchantName());
        return MerchantConvert.INSTANCE.merchantToMerchantDTO(merchant);
    }

    @Override
    @Transactional
    public MerchantDTO createMerchant(MerchantDTO merchantDTO) {
        Merchant merchant = new Merchant();
        //设置审核状态0‐未申请,1‐已申请待审核,2‐审核通过,3‐审核拒绝
        merchant.setAuditStatus("0");
        //设置手机号
        merchant.setMobile(merchantDTO.getMobile());
        //...
        //保存商户
        merchantMapper.insert(merchant);
        //将新增商户id返回
        merchantDTO.setId(merchant.getId());
        return merchantDTO;
    }
}
