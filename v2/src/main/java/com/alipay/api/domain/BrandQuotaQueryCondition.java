package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌额度查询条件
 *
 * @author auto create
 * @since 1.0, 2022-11-10 17:23:02
 */
public class BrandQuotaQueryCondition extends AlipayObject {

	private static final long serialVersionUID = 5413519681866813862L;

	/**
	 * 是否查询可使用商家列表,true时不用填seller信息,false时必填seller信息
	 */
	@ApiField("is_query_seller_list")
	private Boolean isQuerySellerList;

	/**
	 * 卖家信息
	 */
	@ApiField("seller_info")
	private CreditPayUserVO sellerInfo;

	public Boolean getIsQuerySellerList() {
		return this.isQuerySellerList;
	}
	public void setIsQuerySellerList(Boolean isQuerySellerList) {
		this.isQuerySellerList = isQuerySellerList;
	}

	public CreditPayUserVO getSellerInfo() {
		return this.sellerInfo;
	}
	public void setSellerInfo(CreditPayUserVO sellerInfo) {
		this.sellerInfo = sellerInfo;
	}

}
