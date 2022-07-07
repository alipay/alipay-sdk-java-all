package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.bind.qrcodecreate response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-25 18:17:53
 */
public class AntMerchantExpandIndirectBindQrcodecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4549473822991543922L;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 申请单是否已存在
	 */
	@ApiField("has_apply")
	private String hasApply;

	/** 
	 * 申请单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 二维码图片的可访问url。有效期24h
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 状态。TRUE创建成功，FALSE创建失败
	 */
	@ApiField("status")
	private String status;

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setHasApply(String hasApply) {
		this.hasApply = hasApply;
	}
	public String getHasApply( ) {
		return this.hasApply;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
