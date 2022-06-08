package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BusinessRelationShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:55:29
 */
public class AlipayBusinessRelationShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4148234345392597895L;

	/** 
	 * 代运营商业关系门店信息
	 */
	@ApiListField("shop_infos")
	@ApiField("business_relation_shop_info")
	private List<BusinessRelationShopInfo> shopInfos;

	public void setShopInfos(List<BusinessRelationShopInfo> shopInfos) {
		this.shopInfos = shopInfos;
	}
	public List<BusinessRelationShopInfo> getShopInfos( ) {
		return this.shopInfos;
	}

}
