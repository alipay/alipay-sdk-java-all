package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT展位投放计划商家取消报名接口
 *
 * @author auto create
 * @since 1.0, 2022-10-17 11:12:51
 */
public class AlipayMarketingIotMerchantplanCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3192699564955993984L;

	/**
	 * 商家活动ID
	 */
	@ApiField("merchant_plan_id")
	private String merchantPlanId;

	public String getMerchantPlanId() {
		return this.merchantPlanId;
	}
	public void setMerchantPlanId(String merchantPlanId) {
		this.merchantPlanId = merchantPlanId;
	}

}
