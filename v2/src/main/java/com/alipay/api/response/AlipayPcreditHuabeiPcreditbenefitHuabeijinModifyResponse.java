package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.huabeijin.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-22 17:27:58
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3775637184575325232L;

	/** 
	 * 活动流水id，原样返回
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 修改订单后计算的待领取花呗金
	 */
	@ApiField("adjusted_amount")
	private Long adjustedAmount;

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

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setAdjustedAmount(Long adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}
	public Long getAdjustedAmount( ) {
		return this.adjustedAmount;
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
