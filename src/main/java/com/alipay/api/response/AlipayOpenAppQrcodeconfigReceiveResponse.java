package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcodeconfig.receive response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOpenAppQrcodeconfigReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 3386467735498434452L;

	/** 
	 * 码配置
	 */
	@ApiField("qr_code_config")
	private String qrCodeConfig;

	public void setQrCodeConfig(String qrCodeConfig) {
		this.qrCodeConfig = qrCodeConfig;
	}
	public String getQrCodeConfig( ) {
		return this.qrCodeConfig;
	}

}
