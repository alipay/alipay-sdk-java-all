package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗短链生成接口
 *
 * @author auto create
 * @since 1.0, 2024-10-11 19:57:16
 */
public class AlipayCommerceMedicalShortenurlExchangeModel extends AlipayObject {

	private static final long serialVersionUID = 2156365876822171122L;

	/**
	 * 目标链接
	 */
	@ApiField("target_url")
	private String targetUrl;

	public String getTargetUrl() {
		return this.targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

}
