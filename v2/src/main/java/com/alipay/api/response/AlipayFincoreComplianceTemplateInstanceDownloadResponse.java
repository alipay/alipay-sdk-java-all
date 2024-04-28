package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.instance.download response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-20 10:16:57
 */
public class AlipayFincoreComplianceTemplateInstanceDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6736653862315362985L;

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
