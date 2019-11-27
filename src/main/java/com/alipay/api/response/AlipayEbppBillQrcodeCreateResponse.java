package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.bill.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayEbppBillQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2637131739929747766L;

	/** 
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 回传ISV流水号，用于控制幂等，须确保全局唯一（缴税业务：可采用{征收机关代码}-{外部申报号}的形式）
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码。
用户扫码后，码会作废，同时产生一笔支付宝流水。如果该笔支付宝流水变为废单（关闭或失败），则ISV可以同一个out_order_no创建一个新的有效码串（qr_code），以供后续重试之用。
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 二维码图片地址
二维码的实际内容与本次返回的qr_code一致
	 */
	@ApiField("qr_code_img_url")
	private String qrCodeImgUrl;

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setQrCodeImgUrl(String qrCodeImgUrl) {
		this.qrCodeImgUrl = qrCodeImgUrl;
	}
	public String getQrCodeImgUrl( ) {
		return this.qrCodeImgUrl;
	}

}
