package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销立减活动基础信息查询
 *
 * @author auto create
 * @since 1.0, 2023-08-03 16:02:34
 */
public class AlipayMarketingCampaignDiscountInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5893167974518372158L;

	/**
	 * 立减活动Id
	 */
	@ApiField("discount_id")
	private String discountId;

	public String getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

}
