package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.rightsorder.pre.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-03 15:12:34
 */
public class AlipayInsRightsorderPreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7519815316838369832L;

	/** 
	 * 当前订单是否有效，true表示有效，可继续执行下单
	 */
	@ApiField("valid")
	private Boolean valid;

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}

}
