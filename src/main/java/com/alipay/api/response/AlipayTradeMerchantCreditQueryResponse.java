package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.merchant.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-10 19:41:23
 */
public class AlipayTradeMerchantCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4313543969426459183L;

	/** 
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

	/** 
	 * 卖家已经授权拆分给到买家的赊账额度,单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("granted_credit_quota")
	private String grantedCreditQuota;

	/** 
	 * 标识商家授信额度的来源，具体的值由支付宝定义
	 */
	@ApiField("merchant_credit_source")
	private String merchantCreditSource;

	/** 
	 * 商家授权开通账期的卖家userid
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	/** 
	 * 当前最大信用额度,单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("total_credit_quota")
	private String totalCreditQuota;

	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}
	public String getCreditScene( ) {
		return this.creditScene;
	}

	public void setGrantedCreditQuota(String grantedCreditQuota) {
		this.grantedCreditQuota = grantedCreditQuota;
	}
	public String getGrantedCreditQuota( ) {
		return this.grantedCreditQuota;
	}

	public void setMerchantCreditSource(String merchantCreditSource) {
		this.merchantCreditSource = merchantCreditSource;
	}
	public String getMerchantCreditSource( ) {
		return this.merchantCreditSource;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}
	public String getMerchantUserId( ) {
		return this.merchantUserId;
	}

	public void setTotalCreditQuota(String totalCreditQuota) {
		this.totalCreditQuota = totalCreditQuota;
	}
	public String getTotalCreditQuota( ) {
		return this.totalCreditQuota;
	}

}
