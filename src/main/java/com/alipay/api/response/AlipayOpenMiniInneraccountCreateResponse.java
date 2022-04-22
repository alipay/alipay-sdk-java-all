package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inneraccount.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-21 10:41:30
 */
public class AlipayOpenMiniInneraccountCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6823673118747982896L;

	/** 
	 * 虚拟PID
	 */
	@ApiField("pid")
	private String pid;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

}
