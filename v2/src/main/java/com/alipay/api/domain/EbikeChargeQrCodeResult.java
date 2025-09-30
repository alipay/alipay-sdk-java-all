package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-27 10:12:29
 */
public class EbikeChargeQrCodeResult extends AlipayObject {

	private static final long serialVersionUID = 8699153851445279832L;

	/**
	 * 业务流水号，入参原样返回
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 生成二维码图片的码值
	 */
	@ApiField("link_code")
	private String linkCode;

	/**
	 * 生成的码值，拼接了入参中的自定义参数
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 方形二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getLinkCode() {
		return this.linkCode;
	}
	public void setLinkCode(String linkCode) {
		this.linkCode = linkCode;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
