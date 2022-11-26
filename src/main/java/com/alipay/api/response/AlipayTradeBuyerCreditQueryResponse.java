package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.buyer.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-10 19:42:04
 */
public class AlipayTradeBuyerCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5113296324871163786L;

	/** 
	 * 标识买家授信额度的来源
	 */
	@ApiField("buyer_credit_source")
	private String buyerCreditSource;

	/** 
	 * 本次授信拆分的买家主体userId
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

	/** 
	 * 标识本次授信拆分的业务场景，具体的值由支付宝定义
	 */
	@ApiField("credit_scene")
	private String creditScene;

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
	 * 当前最大信用额度
	 */
	@ApiField("total_credit_quota")
	private String totalCreditQuota;

	/** 
	 * 买家已经使用的信用额度
	 */
	@ApiField("used_credit_quota")
	private String usedCreditQuota;

	public void setBuyerCreditSource(String buyerCreditSource) {
		this.buyerCreditSource = buyerCreditSource;
	}
	public String getBuyerCreditSource( ) {
		return this.buyerCreditSource;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setCreditScene(String creditScene) {
		this.creditScene = creditScene;
	}
	public String getCreditScene( ) {
		return this.creditScene;
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

	public void setUsedCreditQuota(String usedCreditQuota) {
		this.usedCreditQuota = usedCreditQuota;
	}
	public String getUsedCreditQuota( ) {
		return this.usedCreditQuota;
	}

}
