package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userwithvid.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-27 19:52:17
 */
public class AlipayOpenIotvspUserwithvidCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7582396488968532955L;

	/** 
	 * 操作流水号，ISV需要记录，后续调用组件等操作需要用到
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
