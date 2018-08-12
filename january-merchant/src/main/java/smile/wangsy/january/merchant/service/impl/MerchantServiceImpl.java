package smile.wangsy.january.merchant.service.impl;

import wang.smile.common.annotation.BaseService;
import wang.smile.common.base.BaseServiceImpl;
import smile.wangsy.january.merchant.dao.mapper.MerchantMapper;
import smile.wangsy.january.merchant.dao.model.Merchant;
import smile.wangsy.january.merchant.dao.model.MerchantExample;
import smile.wangsy.january.merchant.service.MerchantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* 商户
* @Author wangsy
* @Date 2018/8/12.
*/
@Service
@Transactional
@BaseService
public class MerchantServiceImpl extends BaseServiceImpl<MerchantMapper, Merchant, MerchantExample> implements MerchantService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MerchantServiceImpl.class);

    @Autowired
    MerchantMapper merchantMapper;

}