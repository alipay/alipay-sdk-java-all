package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.collect.singlemoneytoken.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:32:29
 */
public class AlipayFundTransCollectSinglemoneytokenCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2823447423244848128L;

	/** 
	 * 其他扩展属性
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 收钱二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 吱口令文案
	 */
	@ApiField("zhi_token")
	private String zhiToken;

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam( ) {
		return this.extParam;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setZhiToken(String zhiToken) {
		this.zhiToken = zhiToken;
	}
	public String getZhiToken( ) {
		return this.zhiToken;
	}

}
