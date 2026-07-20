package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.huabeijin.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-14 14:37:12
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 7875541972216624187L;

	/** 
	 * 真实发放的花呗金
	 */
	@ApiField("activated_amount")
	private Long activatedAmount;

	/** 
	 * 活动流水id，原样返回
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 不同的业务码表示在花呗侧业务处理过程中的不同状态
	 */
	@ApiField("hb_biz_code")
	private String hbBizCode;

	/** 
	 * 商家操作流水id，原样返回
	 */
	@ApiField("operation_seq_id")
	private String operationSeqId;

	/** 
	 * 商家业务单号，原样返回
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setActivatedAmount(Long activatedAmount) {
		this.activatedAmount = activatedAmount;
	}
	public Long getActivatedAmount( ) {
		return this.activatedAmount;
	}

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setHbBizCode(String hbBizCode) {
		this.hbBizCode = hbBizCode;
	}
	public String getHbBizCode( ) {
		return this.hbBizCode;
	}

	public void setOperationSeqId(String operationSeqId) {
		this.operationSeqId = operationSeqId;
	}
	public String getOperationSeqId( ) {
		return this.operationSeqId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
