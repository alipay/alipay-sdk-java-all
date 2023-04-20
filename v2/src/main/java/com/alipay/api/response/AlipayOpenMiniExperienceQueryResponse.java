package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.experience.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:31:46
 */
public class AlipayOpenMiniExperienceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6328423614656738698L;

	/** 
	 * 小程序体验版二维码地址
	 */
	@ApiField("exp_qr_code_url")
	private String expQrCodeUrl;

	/** 
	 * 体验版schema
	 */
	@ApiField("exp_schema_url")
	private String expSchemaUrl;

	/** 
	 * 体验版打包状态。状态枚举如下：
expVersionPackged：体验版打包成功；
expVersionPackaging：体验版打包中；
notExpVersion：非体验版。
	 */
	@ApiField("status")
	private String status;

	public void setExpQrCodeUrl(String expQrCodeUrl) {
		this.expQrCodeUrl = expQrCodeUrl;
	}
	public String getExpQrCodeUrl( ) {
		return this.expQrCodeUrl;
	}

	public void setExpSchemaUrl(String expSchemaUrl) {
		this.expSchemaUrl = expSchemaUrl;
	}
	public String getExpSchemaUrl( ) {
		return this.expSchemaUrl;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
