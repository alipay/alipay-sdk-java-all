package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.iifaadid.cert.invalid response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-24 14:22:04
 */
public class AlipaySecurityProdIifaadidCertInvalidResponse extends AlipayResponse {

	private static final long serialVersionUID = 3865147258655767972L;

	/** 
	 * 响应结果
	 */
	@ApiField("bsn")
	private String bsn;

	/** 
	 * 响应结果数据
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 时间戳
	 */
	@ApiField("time_stamp")
	private String timeStamp;

	public void setBsn(String bsn) {
		this.bsn = bsn;
	}
	public String getBsn( ) {
		return this.bsn;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTimeStamp( ) {
		return this.timeStamp;
	}

}
