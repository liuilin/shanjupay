package com.shanjupay.merchant.api;

import com.shanjupay.merchant.api.dto.MerchantDTO;

/**
 * Created by liuqiang.
 */
public interface MerchantService {

    //根据 id查询商户
    MerchantDTO queryMerchantById(Long id);
}
