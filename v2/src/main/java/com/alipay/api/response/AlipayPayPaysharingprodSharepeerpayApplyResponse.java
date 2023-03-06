package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.paysharingprod.sharepeerpay.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:06:46
 */
public class AlipayPayPaysharingprodSharepeerpayApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6597512347741422934L;

	/** 
	 * 支付宝好友分享代付链接
	 */
	@ApiField("friend_share_page_url")
	private String friendSharePageUrl;

	/** 
	 * 代付单号
	 */
	@ApiField("peerpay_order_no")
	private String peerpayOrderNo;

	/** 
	 * 分享代付二维码码值
	 */
	@ApiField("qrcode")
	private String qrcode;

	/** 
	 * 分享代付二维码图片
	 */
	@ApiField("qrcode_image")
	private String qrcodeImage;

	/** 
	 * 分享代付吱口令
	 */
	@ApiField("ztoken")
	private String ztoken;

	public void setFriendSharePageUrl(String friendSharePageUrl) {
		this.friendSharePageUrl = friendSharePageUrl;
	}
	public String getFriendSharePageUrl( ) {
		return this.friendSharePageUrl;
	}

	public void setPeerpayOrderNo(String peerpayOrderNo) {
		this.peerpayOrderNo = peerpayOrderNo;
	}
	public String getPeerpayOrderNo( ) {
		return this.peerpayOrderNo;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getQrcode( ) {
		return this.qrcode;
	}

	public void setQrcodeImage(String qrcodeImage) {
		this.qrcodeImage = qrcodeImage;
	}
	public String getQrcodeImage( ) {
		return this.qrcodeImage;
	}

	public void setZtoken(String ztoken) {
		this.ztoken = ztoken;
	}
	public String getZtoken( ) {
		return this.ztoken;
	}

}
