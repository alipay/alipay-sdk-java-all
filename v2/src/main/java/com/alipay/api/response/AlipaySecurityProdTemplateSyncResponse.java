package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:50:34
 */
public class AlipaySecurityProdTemplateSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2647687562416999255L;

	/** 
	 * 模板模板编码
	 */
	@ApiField("tgt_template_code")
	private String tgtTemplateCode;

	/** 
	 * 版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setTgtTemplateCode(String tgtTemplateCode) {
		this.tgtTemplateCode = tgtTemplateCode;
	}
	public String getTgtTemplateCode( ) {
		return this.tgtTemplateCode;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
