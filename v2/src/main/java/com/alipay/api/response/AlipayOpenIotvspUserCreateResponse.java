package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-23 09:05:32
 */
public class AlipayOpenIotvspUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2363538234416663578L;

	/** 
	 * 操作流水号，ISV需要记录，后续调用组件...
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
