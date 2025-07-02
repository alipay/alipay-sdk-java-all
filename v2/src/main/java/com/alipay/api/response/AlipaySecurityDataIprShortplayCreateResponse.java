package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.ipr.shortplay.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-09 13:07:26
 */
public class AlipaySecurityDataIprShortplayCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7446521982554483918L;

	/** 
	 * 业务处理结果码对应文字说明
	 */
	@ApiField("desc")
	private String desc;

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

}
