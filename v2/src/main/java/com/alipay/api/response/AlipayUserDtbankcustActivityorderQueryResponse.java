package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbankcust.activityorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 06:41:52
 */
public class AlipayUserDtbankcustActivityorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8677924917768258237L;

	/** 
	 * 数字分行活动唯一id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动流水单据唯一id
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 外部唯一业务幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 流水状态
INIT("INIT", "初始化"),
 SUCCESS("SUCCESS", "成功"),
FAILED("FAILED", "失败"),
PENDING("PENDING", "挂起"),
	 */
	@ApiField("status")
	private String status;

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityId( ) {
		return this.activityId;
	}

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
