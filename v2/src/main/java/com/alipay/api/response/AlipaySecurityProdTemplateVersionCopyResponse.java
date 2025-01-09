package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.version.copy response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-28 17:52:22
 */
public class AlipaySecurityProdTemplateVersionCopyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432454622777319571L;

	/** 
	 * 版本拷贝结果
	 */
	@ApiField("copy_result")
	private Boolean copyResult;

	/** 
	 * 版本号
	 */
	@ApiField("version_no")
	private String versionNo;

	public void setCopyResult(Boolean copyResult) {
		this.copyResult = copyResult;
	}
	public Boolean getCopyResult( ) {
		return this.copyResult;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionNo( ) {
		return this.versionNo;
	}

}
