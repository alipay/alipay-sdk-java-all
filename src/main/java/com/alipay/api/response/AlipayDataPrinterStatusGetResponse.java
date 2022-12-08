package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.printer.status.get response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 10:12:16
 */
public class AlipayDataPrinterStatusGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2527415947657722481L;

	/** 
	 * 状态码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 设备状态
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 描述
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
