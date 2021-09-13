package com.shanjupay.merchant.convert;

import com.shanjupay.merchant.api.dto.MerchantDTO;
import com.shanjupay.merchant.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.mapstruct.factory.Mappers;


/**
 * 商户对象转换类
 *
 * @author liuqiang
 * @since 2021-09-13
 */
@Mapper
public interface MerchantConvert {
    MerchantConvert INSTANCE = Mappers.getMapper(MerchantConvert.class);

    Merchant merchantDTOtoMerchant(MerchantDTO merchantDTO);
    MerchantDTO merchantToMerchantDTO(Merchant merchant);
}