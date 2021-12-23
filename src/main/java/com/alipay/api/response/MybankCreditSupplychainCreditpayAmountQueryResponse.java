package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.amount.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:09:12
 */
public class MybankCreditSupplychainCreditpayAmountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3221514342745378427L;

	/** 
	 * 准入标志
	 */
	@ApiField("admit")
	private Boolean admit;

	/** 
	 * 可用额度
	 */
	@ApiField("available_amt")
	private String availableAmt;

	/** 
	 * 1688买家ID
	 */
	@ApiField("buyer_scene_id")
	private String buyerSceneId;

	/** 
	 * 是否签约
	 */
	@ApiField("signed")
	private Boolean signed;

	/** 
	 * 授信额度
	 */
	@ApiField("total_amt")
	private String totalAmt;

	/** 
	 * Trace信息
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAdmit(Boolean admit) {
		this.admit = admit;
	}
	public Boolean getAdmit( ) {
		return this.admit;
	}

	public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}
	public String getAvailableAmt( ) {
		return this.availableAmt;
	}

	public void setBuyerSceneId(String buyerSceneId) {
		this.buyerSceneId = buyerSceneId;
	}
	public String getBuyerSceneId( ) {
		return this.buyerSceneId;
	}

	public void setSigned(Boolean signed) {
		this.signed = signed;
	}
	public Boolean getSigned( ) {
		return this.signed;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getTotalAmt( ) {
		return this.totalAmt;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
