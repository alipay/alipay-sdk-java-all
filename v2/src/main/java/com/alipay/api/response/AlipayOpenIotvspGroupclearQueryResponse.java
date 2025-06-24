package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.groupclear.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 15:17:04
 */
public class AlipayOpenIotvspGroupclearQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2125232149657117952L;

	/** 
	 * 接口成功时返回status字段
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
