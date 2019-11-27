package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.cert.csr.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipaySecurityProdCertCsrApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153164643236771533L;

	/** 
	 * TA里使用对应私钥对公钥pubkey签名+pubkey原文
	 */
	@ApiField("csr_content")
	private String csrContent;

	/** 
	 * 已经生成的证书对应的一个唯一id，设备相关的，如果同一不存在设备不存在，则为1，否则在已存的最大keyid基础上进行累加
	 */
	@ApiField("keyid")
	private String keyid;

	/** 
	 * 随机生成的biz_no,关联服务端与ta里一次指令的唯一业务ID
	 */
	@ApiField("refcode")
	private String refcode;

	/** 
	 * IFAA标准中用于关联IFAA Server和业务方Server开通状态的token，此token用于提供给业务方关联校验结果。
	 */
	@ApiField("token")
	private String token;

	public void setCsrContent(String csrContent) {
		this.csrContent = csrContent;
	}
	public String getCsrContent( ) {
		return this.csrContent;
	}

	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}
	public String getKeyid( ) {
		return this.keyid;
	}

	public void setRefcode(String refcode) {
		this.refcode = refcode;
	}
	public String getRefcode( ) {
		return this.refcode;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
