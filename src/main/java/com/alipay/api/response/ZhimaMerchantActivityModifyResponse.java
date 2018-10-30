package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.modify response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-25 15:24:03
 */
public class ZhimaMerchantActivityModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3173486598746257326L;

	/** 
	 * 芝麻活动号
	 */
	@ApiField("activity_no")
	private String activityNo;

	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}
	public String getActivityNo( ) {
		return this.activityNo;
	}

}
