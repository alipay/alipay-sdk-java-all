package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:50:20
 */
public class AlipaySecurityProdTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7231697865829668584L;

	/** 
	 * 创建完成后返回模板编码
	 */
	@ApiField("template_code")
	private String templateCode;

	/** 
	 * 版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateCode( ) {
		return this.templateCode;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
