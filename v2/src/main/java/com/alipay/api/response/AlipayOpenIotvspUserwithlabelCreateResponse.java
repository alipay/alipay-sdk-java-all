package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotvsp.userwithlabel.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-21 16:57:52
 */
public class AlipayOpenIotvspUserwithlabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6893552727913768384L;

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
