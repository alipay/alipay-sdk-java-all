package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.srcfterdelivery.access.approve response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-21 17:37:26
 */
public class XingheLendassistSrcfterdeliveryAccessApproveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7886161537496214818L;

	/** 
	 * 审核结果，APPROVE_PASS-审批通过、APPROVE_REJECT-审批拒绝
	 */
	@ApiField("approve_result")
	private String approveResult;

	/** 
	 * 终端交付申请返回的唯一申请单号
	 */
	@ApiField("delivery_apply_no")
	private String deliveryApplyNo;

	/** 
	 * 终端交付审核拒绝时，返回拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	public void setApproveResult(String approveResult) {
		this.approveResult = approveResult;
	}
	public String getApproveResult( ) {
		return this.approveResult;
	}

	public void setDeliveryApplyNo(String deliveryApplyNo) {
		this.deliveryApplyNo = deliveryApplyNo;
	}
	public String getDeliveryApplyNo( ) {
		return this.deliveryApplyNo;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}
	public String getRefuseReason( ) {
		return this.refuseReason;
	}

}
