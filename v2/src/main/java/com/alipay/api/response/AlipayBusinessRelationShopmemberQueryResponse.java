package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopMemberInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.relation.shopmember.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-12 13:40:36
 */
public class AlipayBusinessRelationShopmemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6187661188382373114L;

	/** 
	 * 商业关系中的门店收单信息
	 */
	@ApiListField("shop_member_infos")
	@ApiField("shop_member_info")
	private List<ShopMemberInfo> shopMemberInfos;

	public void setShopMemberInfos(List<ShopMemberInfo> shopMemberInfos) {
		this.shopMemberInfos = shopMemberInfos;
	}
	public List<ShopMemberInfo> getShopMemberInfos( ) {
		return this.shopMemberInfos;
	}

}
