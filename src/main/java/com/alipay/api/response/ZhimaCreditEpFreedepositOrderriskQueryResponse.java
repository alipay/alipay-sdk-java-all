package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.freedeposit.orderrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class ZhimaCreditEpFreedepositOrderriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7496221624342155884L;

	/** 
	 * 风控结果
	 */
	@ApiField("decision")
	private String decision;

	/** 
	 * 芝麻业务流水号
	 */
	@ApiField("lease_order_no")
	private String leaseOrderNo;

	/** 
	 * 商户业务流水号，请确保每次业务唯一
	 */
	@ApiField("merchant_lease_order_no")
	private String merchantLeaseOrderNo;

	/** 
	 * 拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	public void setDecision(String decision) {
		this.decision = decision;
	}
	public String getDecision( ) {
		return this.decision;
	}

	public void setLeaseOrderNo(String leaseOrderNo) {
		this.leaseOrderNo = leaseOrderNo;
	}
	public String getLeaseOrderNo( ) {
		return this.leaseOrderNo;
	}

	public void setMerchantLeaseOrderNo(String merchantLeaseOrderNo) {
		this.merchantLeaseOrderNo = merchantLeaseOrderNo;
	}
	public String getMerchantLeaseOrderNo( ) {
		return this.merchantLeaseOrderNo;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

}
