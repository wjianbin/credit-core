package com.wanda.credit.ds.dao.iface.huifa.inter;

import com.wanda.credit.base.service.IBaseService;
import com.wanda.credit.ds.dao.domain.huifa.IdentifyDishonestTax;

public interface IIdentifyDishonestTaxService extends IBaseService<IdentifyDishonestTax>{
	public void write(IdentifyDishonestTax identifyDishonestTax);
}
