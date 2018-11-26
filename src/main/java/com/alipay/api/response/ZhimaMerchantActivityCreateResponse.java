package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2018-10-25 15:30:01
 */
public class ZhimaMerchantActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2293279637632661261L;

	/** 
	 * 芝麻活动号，创建成功后回传，用于商户侧做关联和后续查询。
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
