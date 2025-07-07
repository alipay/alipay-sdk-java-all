package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditpaySubquota;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.creditpay.amount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:14
 */
public class MybankCreditSupplychainCreditpayAmountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2661461352937655984L;

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
	 * 子额度类型
	 */
	@ApiListField("creditpay_sub_quotas")
	@ApiField("creditpay_subquota")
	private List<CreditpaySubquota> creditpaySubQuotas;

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

	public void setCreditpaySubQuotas(List<CreditpaySubquota> creditpaySubQuotas) {
		this.creditpaySubQuotas = creditpaySubQuotas;
	}
	public List<CreditpaySubquota> getCreditpaySubQuotas( ) {
		return this.creditpaySubQuotas;
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
