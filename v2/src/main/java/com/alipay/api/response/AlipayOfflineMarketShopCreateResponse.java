package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:20
 */
public class AlipayOfflineMarketShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5138168819855735864L;

	/** 
	 * 开店请求受理成功后返回的支付宝流水ID，根据此ID调用接口
alipay.offline.market.applyorder.batchquery，能够获取当前开店请求审核状态、驳回原因等信息。
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 废弃字段。
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 同步请求如果支付宝受理成功，将返回AUDITING状态。
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * 废弃字段，T表示上架,F表示未上架。
	 */
	@ApiField("is_online")
	private String isOnline;

	/** 
	 * 废弃字段，T表示显示，F表示隐藏。
	 */
	@ApiField("is_show")
	private String isShow;

	/** 
	 * 门店费率值，指定的ISV可用。创建门店时，为符合情况的门店，进行费率单独设置。若费率不符合门店类目的设置，则会创建门店失败。
	 */
	@ApiField("rate")
	private String rate;

	/** 
	 * 开店请求结果码：
WAIT_MERCHANT_CONFIRM：等待商户确认
当开店需要商户确认时返回此结果码，商户需要登录到商家中心e.alipay.com进行开店确认。例如，ISV帮商户开店时，出现需要改签口碑当面付主体，接口同步返回此错误码，并且支付宝发送短信告知商户登录商家中心进行改签确认，确认后进入到后续审核流程。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 废弃字段，支付宝门店ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsShow( ) {
		return this.isShow;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate( ) {
		return this.rate;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
