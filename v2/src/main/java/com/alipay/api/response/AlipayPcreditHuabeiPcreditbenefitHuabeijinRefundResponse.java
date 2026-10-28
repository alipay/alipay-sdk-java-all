package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.huabeijin.refund response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 17:06:26
 */
public class AlipayPcreditHuabeiPcreditbenefitHuabeijinRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 4144185763438633779L;

	/** 
	 * 用户发奖活动调用成功之后给用户的单据id，用于后续的变更操作
	 */
	@ApiField("activity_order_id")
	private String activityOrderId;

	/** 
	 * 根据用户剩余花呗金数量结合本次退款的金额，尽力扣除的花呗金数量，用户花呗金数量不足的时候会小于应扣除花呗金数量，123花呗金代表123分
	 */
	@ApiField("actual_deducted")
	private Long actualDeducted;

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
	 * 输入中的外部业务单据，原样返回
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 用于表述根据本次退款金额和用户信息计算出的应该扣除的花呗金数量，123个花呗金代表123分
	 */
	@ApiField("should_deducted")
	private Long shouldDeducted;

	public void setActivityOrderId(String activityOrderId) {
		this.activityOrderId = activityOrderId;
	}
	public String getActivityOrderId( ) {
		return this.activityOrderId;
	}

	public void setActualDeducted(Long actualDeducted) {
		this.actualDeducted = actualDeducted;
	}
	public Long getActualDeducted( ) {
		return this.actualDeducted;
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

	public void setShouldDeducted(Long shouldDeducted) {
		this.shouldDeducted = shouldDeducted;
	}
	public Long getShouldDeducted( ) {
		return this.shouldDeducted;
	}

}
