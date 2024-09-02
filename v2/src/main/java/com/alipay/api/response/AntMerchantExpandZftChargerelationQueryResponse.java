package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.zft.chargerelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:18
 */
public class AntMerchantExpandZftChargerelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4516732893833611258L;

	/** 
	 * 审核驳回原因
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/** 
	 * orderId
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 申请单处理失败原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 记账方smid
	 */
	@ApiField("smid")
	private String smid;

	/** 
	 * 申请单状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 记账对手方smid
	 */
	@ApiField("target_smid")
	private String targetSmid;

	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}
	public String getAuditMemo( ) {
		return this.auditMemo;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setSmid(String smid) {
		this.smid = smid;
	}
	public String getSmid( ) {
		return this.smid;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTargetSmid(String targetSmid) {
		this.targetSmid = targetSmid;
	}
	public String getTargetSmid( ) {
		return this.targetSmid;
	}

}
