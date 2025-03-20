package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.promotionurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-26 10:22:24
 */
public class AlipayMerchantGroupPromotionurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8392926887637679574L;

	/** 
	 * 定义群组分类，便于后台管理运营识别，可与下面设置的群名称保持一致；例：xx门店群，内部测试群
	 */
	@ApiField("group_name")
	private String groupName;

	/** 
	 * 群组推广链接
	 */
	@ApiField("promotion_url")
	private String promotionUrl;

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}

	public void setPromotionUrl(String promotionUrl) {
		this.promotionUrl = promotionUrl;
	}
	public String getPromotionUrl( ) {
		return this.promotionUrl;
	}

}
