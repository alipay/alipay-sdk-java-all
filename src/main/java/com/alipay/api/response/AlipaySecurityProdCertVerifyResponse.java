package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.cert.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdCertVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5769187187668446274L;

	/** 
	 * 证书唯一编号
	 */
	@ApiField("cert_sn")
	private String certSn;

	/** 
	 * 随机生成的biz_no,关联服务端与ta里一次指令的唯一业务ID
	 */
	@ApiField("refcode")
	private String refcode;

	/** 
	 * 校验原文数据
	 */
	@ApiField("sign_data")
	private String signData;

	/** 
	 * 校验签名数据
	 */
	@ApiField("signed_data")
	private String signedData;

	public void setCertSn(String certSn) {
		this.certSn = certSn;
	}
	public String getCertSn( ) {
		return this.certSn;
	}

	public void setRefcode(String refcode) {
		this.refcode = refcode;
	}
	public String getRefcode( ) {
		return this.refcode;
	}

	public void setSignData(String signData) {
		this.signData = signData;
	}
	public String getSignData( ) {
		return this.signData;
	}

	public void setSignedData(String signedData) {
		this.signedData = signedData;
	}
	public String getSignedData( ) {
		return this.signedData;
	}

}
