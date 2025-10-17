package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.cname.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:17
 */
public class AlipayCloudCloudbaseHttpaccessCnameGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7389764621457349714L;

	/** 
	 * 自定义域名CNAME目标地址
	 */
	@ApiField("cname")
	private String cname;

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname( ) {
		return this.cname;
	}

}
