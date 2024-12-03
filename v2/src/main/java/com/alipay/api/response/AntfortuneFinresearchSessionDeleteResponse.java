package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.session.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-07 10:42:03
 */
public class AntfortuneFinresearchSessionDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6843635227312538768L;

	/** 
	 * 是否删除成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
