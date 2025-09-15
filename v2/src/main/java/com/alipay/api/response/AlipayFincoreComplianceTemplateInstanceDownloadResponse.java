package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.download response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:57:14
 */
public class AlipayFincoreComplianceTemplateInstanceDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1634485588668713241L;

	/** 
	 * 下载链接
	 */
	@ApiField("down_url")
	private String downUrl;

	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}
	public String getDownUrl( ) {
		return this.downUrl;
	}

}
