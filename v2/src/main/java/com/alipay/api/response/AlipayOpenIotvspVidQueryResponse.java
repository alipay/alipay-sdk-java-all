package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.vid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-11 15:01:44
 */
public class AlipayOpenIotvspVidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3557143249128698156L;

	/** 
	 * 刷脸的加密id
	 */
	@ApiField("vid")
	private String vid;

	public void setVid(String vid) {
		this.vid = vid;
	}
	public String getVid( ) {
		return this.vid;
	}

}
