package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 人企店关系集
 *
 * @author auto create
 * @since 1.0, 2024-06-13 11:53:56
 */
public class RebusinessEntityRelation extends AlipayObject {

	private static final long serialVersionUID = 1449722893352612786L;

	/**
	 * 企业关系列表
	 */
	@ApiListField("org_list")
	@ApiField("company_relation_info")
	private List<CompanyRelationInfo> orgList;

	/**
	 * 店铺关系列表
	 */
	@ApiListField("shop_list")
	@ApiField("shop_relation_info")
	private List<ShopRelationInfo> shopList;

	public List<CompanyRelationInfo> getOrgList() {
		return this.orgList;
	}
	public void setOrgList(List<CompanyRelationInfo> orgList) {
		this.orgList = orgList;
	}

	public List<ShopRelationInfo> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<ShopRelationInfo> shopList) {
		this.shopList = shopList;
	}

}
