package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.rightsorder.pre.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-09 16:32:29
 */
public class AlipayInsRightsorderPreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6795338176399887679L;

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
