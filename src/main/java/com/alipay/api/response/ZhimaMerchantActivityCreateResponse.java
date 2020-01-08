package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-21 12:06:43
 */
public class ZhimaMerchantActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1113338114292446696L;

	/** 
	 * 芝麻活动号，创建成功后回传，用于商户侧做关联和后续查询。
	 */
	@ApiField("activity_no")
	private String activityNo;

	/** 
	 * 外部活动号，由ISV传入，无需脱敏，返回为了做芝麻活动号的关联。
	 */
	@ApiField("out_activity_no")
	private String outActivityNo;

	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}
	public String getActivityNo( ) {
		return this.activityNo;
	}

	public void setOutActivityNo(String outActivityNo) {
		this.outActivityNo = outActivityNo;
	}
	public String getOutActivityNo( ) {
		return this.outActivityNo;
	}

}
