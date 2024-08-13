package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-07 19:13:12
 */
public class AlipayUserDtbankQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8746258227543357531L;

	/** 
	 * 银行码码值
	 */
	@ApiField("qrcode")
	private String qrcode;

	/** 
	 * 银行码全局唯一Id
	 */
	@ApiField("qrcode_id")
	private String qrcodeId;

	/** 
	 * 银行码外部展示Id
	 */
	@ApiField("qrcode_out_id")
	private String qrcodeOutId;

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getQrcode( ) {
		return this.qrcode;
	}

	public void setQrcodeId(String qrcodeId) {
		this.qrcodeId = qrcodeId;
	}
	public String getQrcodeId( ) {
		return this.qrcodeId;
	}

	public void setQrcodeOutId(String qrcodeOutId) {
		this.qrcodeOutId = qrcodeOutId;
	}
	public String getQrcodeOutId( ) {
		return this.qrcodeOutId;
	}

}
