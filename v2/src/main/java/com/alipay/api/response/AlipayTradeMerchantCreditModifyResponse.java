package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.merchant.credit.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:11
 */
public class AlipayTradeMerchantCreditModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8243276385482528991L;

	/** 
	 * 当前最大信用额度
	 */
	@ApiField("current_credit_quota")
	private String currentCreditQuota;

	/** 
	 * 卖家已经授权拆分给到买家的赊账额度
	 */
	@ApiField("granted_credit_quota")
	private String grantedCreditQuota;

	/** 
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setCurrentCreditQuota(String currentCreditQuota) {
		this.currentCreditQuota = currentCreditQuota;
	}
	public String getCurrentCreditQuota( ) {
		return this.currentCreditQuota;
	}

	public void setGrantedCreditQuota(String grantedCreditQuota) {
		this.grantedCreditQuota = grantedCreditQuota;
	}
	public String getGrantedCreditQuota( ) {
		return this.grantedCreditQuota;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
