package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.iot.ftoken.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-28 09:57:00
 */
public class AlipayCommerceMedicalIotFtokenGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4672369297612515674L;

	/** 
	 * 是否亲情码值，"1"代表是亲情码值
	 */
	@ApiField("fm_flag")
	private String fmFlag;

	/** 
	 * 用户刷脸ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	public void setFmFlag(String fmFlag) {
		this.fmFlag = fmFlag;
	}
	public String getFmFlag( ) {
		return this.fmFlag;
	}

	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}
	public String getFtoken( ) {
		return this.ftoken;
	}

}
