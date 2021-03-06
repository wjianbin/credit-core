package com.wanda.credit.ds.dao.iface.huifa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanda.credit.base.dao.DaoService;
import com.wanda.credit.base.service.impl.BaseServiceImpl;
import com.wanda.credit.ds.dao.domain.huifa.RegisterInfo;
import com.wanda.credit.ds.dao.iface.huifa.inter.IRegisterInfoService;

@Service
@Transactional
public class RegisterInfoService extends BaseServiceImpl<RegisterInfo> implements IRegisterInfoService{
	@Autowired
    private DaoService daoService;
	public void write(RegisterInfo registerInfo){
		daoService.create(registerInfo);
   }
}
