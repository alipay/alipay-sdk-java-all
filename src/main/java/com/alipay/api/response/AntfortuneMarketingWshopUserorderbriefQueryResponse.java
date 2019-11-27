package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.marketing.wshop.userorderbrief.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntfortuneMarketingWshopUserorderbriefQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678846874183391899L;

	/** 
	 * 是否由定投基金投资
	 */
	@ApiField("is_fixed_purchas")
	private Boolean isFixedPurchas;

	/** 
	 * 是否由非定投基金投资
	 */
	@ApiField("is_un_fixed_purchas")
	private Boolean isUnFixedPurchas;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setIsFixedPurchas(Boolean isFixedPurchas) {
		this.isFixedPurchas = isFixedPurchas;
	}
	public Boolean getIsFixedPurchas( ) {
		return this.isFixedPurchas;
	}

	public void setIsUnFixedPurchas(Boolean isUnFixedPurchas) {
		this.isUnFixedPurchas = isUnFixedPurchas;
	}
	public Boolean getIsUnFixedPurchas( ) {
		return this.isUnFixedPurchas;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
