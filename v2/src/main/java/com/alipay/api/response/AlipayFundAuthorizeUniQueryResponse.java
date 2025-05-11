package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.authorize.uni.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-03 10:37:21
 */
public class AlipayFundAuthorizeUniQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6479792349251179368L;

	/** 
	 * 授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * true（已授权电子回单）
	 */
	@ApiField("authorize_electronic_receipt")
	private Boolean authorizeElectronicReceipt;

	/** 
	 * 业务场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 操作时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 标准制单授权（FUND_AUTHORIZE_FLOW）
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/** 
	 * 业务产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 授权状态
	 */
	@ApiField("status")
	private String status;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setAuthorizeElectronicReceipt(Boolean authorizeElectronicReceipt) {
		this.authorizeElectronicReceipt = authorizeElectronicReceipt;
	}
	public Boolean getAuthorizeElectronicReceipt( ) {
		return this.authorizeElectronicReceipt;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}
	public String getOperateTime( ) {
		return this.operateTime;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}
	public String getPersonalProductCode( ) {
		return this.personalProductCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
