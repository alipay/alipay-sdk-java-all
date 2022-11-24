package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付券
 *
 * @author auto create
 * @since 1.0, 2022-09-30 16:44:15
 */
public class AlipayMarketingActivityVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2465683716595386573L;

	/**
	 * 活动 id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户接入模式。
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

}
