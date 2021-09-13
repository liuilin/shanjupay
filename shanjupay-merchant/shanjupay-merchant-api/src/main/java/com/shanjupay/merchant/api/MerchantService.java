package com.shanjupay.merchant.api;

import com.shanjupay.merchant.api.dto.MerchantDTO;

/**
 * Created by liuqiang.
 */
public interface MerchantService {

    // 根据 id 查询商户
    MerchantDTO queryMerchantById(Long id);

    /**
     * 商户注册
     *
     * @return
     */
    MerchantDTO createMerchant(MerchantDTO merchantDTO);
}
