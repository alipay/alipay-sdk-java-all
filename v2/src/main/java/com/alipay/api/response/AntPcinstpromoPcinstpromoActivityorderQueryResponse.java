package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.pcinstpromo.pcinstpromo.activityorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-27 08:54:08
 */
public class AntPcinstpromoPcinstpromoActivityorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8421269294354285721L;

	/** 
	 * P站配置的活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/** 
	 * 活动流水单据唯一id
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 流水状态 INIT("INIT", "初始化"), SUCCESS("SUCCESS", "成功"), FAILED("FAILED", "失败"), PENDING("PENDING", "挂起"),
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
