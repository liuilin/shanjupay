package com.shanjupay.merchant.convert;

import com.shanjupay.merchant.api.dto.MerchantDTO;
import com.shanjupay.merchant.entity.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author liuqiang
 * @since 2021-09-13
 */
@Mapper
public interface MerchantConvert1 {
    MerchantConvert1 INSTANCE = Mappers.getMapper(MerchantConvert1.class);

    MerchantDTO merchantToMerchantDTO(Merchant merchant);
}
