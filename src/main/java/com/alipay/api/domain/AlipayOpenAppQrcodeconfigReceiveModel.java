package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求动态码配置
 *
 * @author auto create
 * @since 1.0, 2018-04-24 22:28:43
 */
public class AlipayOpenAppQrcodeconfigReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 4474585314455272995L;

	/**
	 * qrCodeFactor
	 */
	@ApiField("qr_code_factor")
	private String qrCodeFactor;

	/**
	 * 码类型
	 */
	@ApiField("qr_code_type")
	private String qrCodeType;

	public String getQrCodeFactor() {
		return this.qrCodeFactor;
	}
	public void setQrCodeFactor(String qrCodeFactor) {
		this.qrCodeFactor = qrCodeFactor;
	}

	public String getQrCodeType() {
		return this.qrCodeType;
	}
	public void setQrCodeType(String qrCodeType) {
		this.qrCodeType = qrCodeType;
	}

}
