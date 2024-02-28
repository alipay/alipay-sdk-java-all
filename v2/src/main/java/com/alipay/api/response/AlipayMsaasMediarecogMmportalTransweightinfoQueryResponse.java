package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmportal.transweightinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-10 15:11:58
 */
public class AlipayMsaasMediarecogMmportalTransweightinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7439979884724113634L;

	/** 
	 * 是否成功
	 */
	@ApiField("achieve")
	private String achieve;

	/** 
	 * 错误信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 重力段信息文件
	 */
	@ApiField("result")
	private String result;

	public void setAchieve(String achieve) {
		this.achieve = achieve;
	}
	public String getAchieve( ) {
		return this.achieve;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
