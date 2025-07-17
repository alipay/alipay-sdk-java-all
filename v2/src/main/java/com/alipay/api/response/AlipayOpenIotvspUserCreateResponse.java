package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.user.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:12
 */
public class AlipayOpenIotvspUserCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8111368231267186626L;

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
