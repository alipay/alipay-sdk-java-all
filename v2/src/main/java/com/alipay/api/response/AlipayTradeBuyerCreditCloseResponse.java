package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.buyer.credit.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:07
 */
public class AlipayTradeBuyerCreditCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 3887214485536795719L;

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
	 * 拆分给买家的额度
	 */
	@ApiField("grant_credit_quota")
	private String grantCreditQuota;

	/** 
	 * 本次授信拆分的操作单号
	 */
	@ApiField("grant_operation_no")
	private String grantOperationNo;

	/** 
	 * 标识本次授信拆分的状态

INIT: 申请中

SUCCESS：已确认

CLOSED: 已撤销
	 */
	@ApiField("grant_status")
	private String grantStatus;

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

	public void setGrantCreditQuota(String grantCreditQuota) {
		this.grantCreditQuota = grantCreditQuota;
	}
	public String getGrantCreditQuota( ) {
		return this.grantCreditQuota;
	}

	public void setGrantOperationNo(String grantOperationNo) {
		this.grantOperationNo = grantOperationNo;
	}
	public String getGrantOperationNo( ) {
		return this.grantOperationNo;
	}

	public void setGrantStatus(String grantStatus) {
		this.grantStatus = grantStatus;
	}
	public String getGrantStatus( ) {
		return this.grantStatus;
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

}
