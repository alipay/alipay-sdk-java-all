package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessRelationChangeShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.changeshop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-21 14:27:52
 */
public class AlipayBusinessRelationChangeshopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8876137456796794732L;

	/** 
	 * 商业关系异动门店信息列表
	 */
	@ApiListField("change_shop_infos")
	@ApiField("business_relation_change_shop_info")
	private List<BusinessRelationChangeShopInfo> changeShopInfos;

	public void setChangeShopInfos(List<BusinessRelationChangeShopInfo> changeShopInfos) {
		this.changeShopInfos = changeShopInfos;
	}
	public List<BusinessRelationChangeShopInfo> getChangeShopInfos( ) {
		return this.changeShopInfos;
	}

}
