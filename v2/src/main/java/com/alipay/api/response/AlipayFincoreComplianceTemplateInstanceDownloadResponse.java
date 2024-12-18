package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.download response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 15:00:40
 */
public class AlipayFincoreComplianceTemplateInstanceDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3761949491922294978L;

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
